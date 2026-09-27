class Solution {
    public int shipWithinDays(int[] weights, int days) {
        
        int sum = 0;
        int max = 0;
        for(int i : weights){
            sum += i;
            max = Math.max(max, i);
        }

        int left = max;
        int right = sum;

        while(left < right){

            int mid = left + (right - left) / 2;

            int s = 0;
            int need = 1;
            for(int i : weights){
                if(s + i > mid){
                    need++;
                    s = 0;
                }
               s += i;
            }

            if(need <= days){
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}