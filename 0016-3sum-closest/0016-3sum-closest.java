class Solution {
    public int threeSumClosest(int[] nums, int target) {

            Arrays.sort(nums);

        int close = 0;
        int diff = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length - 2; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;

            int j = i+1;
            int k = nums.length - 1;

            while(j < k){

                int sum = nums[i] + nums[j] + nums[k];
                int cdiff = Math.abs(sum - target);

                if(cdiff < diff){
                    diff = Math.min(diff, cdiff);
                    close = sum;
                }
                

                if(sum < target){
                    j++;
                } else if(sum > target) {
                    k--;
                } else{
                    return target;
                }


            }
        }

        return close;

    }
}