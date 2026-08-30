class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        
        int[] hash = new int[100001];

        int j = 0;
        int d = 0;
        long sum = 0;
        long maxs = 0;

        for(int i = 0; i < nums.length; i++){
            
            sum += nums[i];

            if(hash[nums[i]] == 0){
                d++;
            }
            hash[nums[i]]++;

            if((i-j+1) > k){

                if(hash[nums[j]] == 1){
                    d--;
                }

                hash[nums[j]]--;
                sum -= nums[j];
                j++;
            }


            if((i-j+1) == k && d == k){
                maxs = Math.max(sum, maxs);
            }


        }

        return maxs;
    }
}