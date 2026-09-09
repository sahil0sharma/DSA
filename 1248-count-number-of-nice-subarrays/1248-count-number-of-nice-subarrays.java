class Solution {
    public int numberOfSubarrays(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);

        int count = 0;
        int prefix = 0;

        for(int i = 0; i < nums.length; i++){

          

            
            if(nums[i] % 2 != 0){
                prefix += 1;
            } else {
                prefix += 0;
            } 

            int need = prefix - k;
            
            count += map.getOrDefault(need, 0);

            map.put(prefix, map.getOrDefault(prefix, 0)+1);


        }

        return count;
    
    }
}