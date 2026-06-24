class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        int n = nums.length;
        int[][] twos = new int[n][2];
        for(int i = 0; i < n; i++){
            twos[i][0] = nums[i];
            twos[i][1] = i;
        }

        Arrays.sort(twos, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[0],o2[0]);
            }
        });

        int right = 0;
        int left = n-1;

        while(right < left){
            int sum = twos[right][0] + twos[left][0];
            if(sum == target){
                arr[0] = twos[right][1];
                arr[1] = twos[left][1];
                return arr;
            } else if(sum < target){
                right++;
            } else {
                left--;
            }
        }

    return new int[]{-1,-1};
    }
}