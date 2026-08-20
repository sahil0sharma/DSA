class Solution {
    public int[] resultArray(int[] nums) {
        
        int n = nums.length;
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        // First operations
        arr1[0] = nums[0];
        arr2[0] = nums[1];

        // Pointers tracking the count / next empty index
        int a = 1;
        int b = 1;

        // Distribute remaining elements
        for (int i = 2; i < n; i++) {
            if (arr1[a - 1] > arr2[b - 1]) {
                arr1[a] = nums[i];
                a++;
            } else {
                arr2[b] = nums[i];
                b++;
            }
        }

        // Merge arr1 followed by arr2
        int[] result = new int[n];
        int idx = 0;

        for (int i = 0; i < a; i++) {
            result[idx++] = arr1[i];
        }
        for (int i = 0; i < b; i++) {
            result[idx++] = arr2[i];
        }

        return result;
        
    }
}