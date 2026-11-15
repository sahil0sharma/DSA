class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] freq = new int[101]; // Constraints: 1 <= nums[i] <= 100
        int goodPairs = 0;

        for (int num : nums) {
            goodPairs += freq[num];
            freq[num]++;
        }

        return goodPairs;
    }
}