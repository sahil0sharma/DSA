class Solution {
    public int search(int[] nums, int target) {
        
        int right = nums.length-1;
        int left = 0;

        while(left <= right){

            int mid = (left + right) / 2;

            if(nums[mid] == target){
                return mid;
            }
                if (nums[left] <= nums[mid]) {

                    // left half is sorted

                    if (nums[left] <= target && target <= nums[mid]) {
                        // target is inside sorted left half
                        right = mid - 1;
                    } else {
                        // target must be in right half
                        left = mid + 1;
                    }
                }else {
                        // right half is sorted

                        if (nums[mid] <= target && target <= nums[right]) {
                            // target is inside sorted right half
                            left = mid + 1;
                        } else {
                            // target must be in left half
                            right = mid - 1;
                        }
                    }
        }
        return -1;
    }

}