class Solution {
    public int maxAbsoluteSum(int[] nums) {
        
        int maxSum = 0;   // Maximum positive subarray sum
        int minSum = 0;   // Minimum (most negative) subarray sum

        int currentMax = 0;
        int currentMin = 0;

        for (int num : nums) {

            // Normal Kadane: find maximum subarray sum
            currentMax = Math.max(num, currentMax + num);
            maxSum = Math.max(maxSum, currentMax);

            // Reverse Kadane: find minimum subarray sum
            currentMin = Math.min(num, currentMin + num);
            minSum = Math.min(minSum, currentMin);
        }

        return Math.max(maxSum, Math.abs(minSum));
    }
}