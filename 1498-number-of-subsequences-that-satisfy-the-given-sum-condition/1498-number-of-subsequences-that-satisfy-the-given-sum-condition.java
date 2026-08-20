class Solution {
    public int numSubseq(int[] nums, int target) {
    int n = nums.length;
        int mod = 1_000_000_007;

        // 1. Sort to fix min at 'i' and max at 'j'
        Arrays.sort(nums);

        // 2. Precompute powers of 2 modulo 10^9 + 7
        int[] power = new int[n];
        power[0] = 1;
        for (int k = 1; k < n; k++) {
            power[k] = (power[k - 1] * 2) % mod;
        }

        int count = 0;
        int i = 0;
        int j = n - 1;

        // 3. Two-pointer search
        while (i <= j) {
            if (nums[i] + nums[j] <= target) {
                count = (count + power[j - i]) % mod;
                i++;
            } else {
                j--;
            }
        }

        return count;
    }
}