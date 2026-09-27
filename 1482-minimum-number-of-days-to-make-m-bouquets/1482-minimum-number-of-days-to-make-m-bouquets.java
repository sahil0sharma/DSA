class Solution {
    public int minDays(int[] bloomDay, int m, int k) {

         if ((long) m * k > bloomDay.length) {
            return -1;
        }
        
        int min = bloomDay[0];
        int max = bloomDay[0];

        for(int i : bloomDay){
            max = Math.max(max, i);
            min = Math.min(min, i);
        }

        int left = min;
        int right = max;

        while(left < right){

            int mid = (right + left) / 2;

            int boke = 0; 
            int consecutive = 0;
            
            for(int day : bloomDay){

                if(day <= mid){
                    consecutive++;

                    if(consecutive == k){
                        consecutive =  0;
                        boke++;
                    }

                }
                else {
                    consecutive = 0;
                }
            }

            if(boke >= m){
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}