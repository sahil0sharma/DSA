class Solution {
    public int maxSubarraySumCircular(int[] nums) {

        int curmax = 0;
        int max = Integer.MIN_VALUE;

        int currmin = 0;
        int min = Integer.MAX_VALUE;

        int total = 0;

        for (int i : nums) {
            total += i;
        }

        for (int i = 0; i < nums.length; i++) {

            currmin = Math.min(nums[i], currmin + nums[i]);
            min = Math.min(min, currmin);

            curmax = Math.max(nums[i], curmax + nums[i]);
            max = Math.max(max, curmax);
        }

        // All elements are negative
        if (max < 0) {
            return max;
        }

        // Normal maximum vs circular maximum
        return Math.max(max, total - min);
    }
}