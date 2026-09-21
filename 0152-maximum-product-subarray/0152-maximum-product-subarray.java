class Solution {
    public int maxProduct(int[] nums) {

        int cmax = nums[0];
        int cmin = nums[0];

        int maxp = nums[0];

        for(int i = 1; i < nums.length; i++){
            
            int n = nums[i];

            int tmax = Math.max(n, Math.max(cmax * n, cmin * n));

            int tmin = Math.min(n, Math.min(cmax * n, cmin * n));

            cmax = tmax;
            cmin = tmin;

            maxp = Math.max(maxp, cmax);
        }

        return maxp;
    }
}