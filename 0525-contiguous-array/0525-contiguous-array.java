class Solution {
    public int findMaxLength(int[] nums) {


        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        
        int prefix = 0;
        int length = 0;
        for(int i = 0; i < nums.length; i++){
            
            if(nums[i] == 0)
            prefix += -1;
            else {
                prefix += nums[i];
            }

            if(map.containsKey(prefix)){
                length = Math.max(length , i - map.get(prefix));
            } else {
                map.put(prefix, i);
            }

        }

        return length;
    }
}