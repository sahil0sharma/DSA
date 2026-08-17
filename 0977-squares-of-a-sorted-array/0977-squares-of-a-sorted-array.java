class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int left = 0;
        int right = nums.length-1;

        int[] suare = new int[nums.length];
        int k = nums.length-1;

        while(left <= right){
            if( Math.abs(nums[left]) < Math.abs(nums[right])){
                suare[k] = nums[right]*nums[right];
                right--;
            } else {
                suare[k] = nums[left]*nums[left];
                left++;
            }
            k--;
        }

        return suare;
    }
}