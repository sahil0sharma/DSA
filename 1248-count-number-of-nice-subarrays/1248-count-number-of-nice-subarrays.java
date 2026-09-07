class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n = nums.length;
        // count[s] stores how many times prefix sum 's' has occurred
        int[] count = new int[n + 1];
        count[0] = 1; // Base case: 0 odd numbers seen once initially
        
        int oddCount = 0;
        int ans = 0;
        
        for (int num : nums) {
            // Add 1 if odd, 0 if even
            oddCount += (num % 2 != 0) ? 1 : 0;
            
            // If we have at least k odds, check how many prefixes had (oddCount - k) odds
            if (oddCount >= k) {
                ans += count[oddCount - k];
            }
            
            // Record current prefix sum frequency
            count[oddCount]++;
        }
        
        return ans;
    }
}