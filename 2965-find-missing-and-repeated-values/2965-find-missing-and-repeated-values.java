class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int totalElements = n * n;
        
        // Frequency array of size n^2 + 1 for 1-based indexing
        int[] freq = new int[totalElements + 1];
        
        // Step 1: Count the frequency of each number in the grid
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                freq[grid[i][j]]++;
            }
        }
        
        int repeated = -1;
        int missing = -1;
        
        // Step 2: Find which number appeared twice and which appeared zero times
        for (int num = 1; num <= totalElements; num++) {
            if (freq[num] == 2) {
                repeated = num;
            } else if (freq[num] == 0) {
                missing = num;
            }
        }
        
        return new int[]{repeated, missing};
    }
}