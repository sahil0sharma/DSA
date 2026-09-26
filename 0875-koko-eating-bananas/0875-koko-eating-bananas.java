class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int max = 0;
        for(int p : piles){
            max = Math.max(max, p);
        }

        int left = 1;
        int right = max;

        while(left < right){
            int t = 0;
          int mid = left + (right - left) / 2;

            for(int i : piles){
                t += (i + mid - 1L) / mid;
            }

            if(t <= h){
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}