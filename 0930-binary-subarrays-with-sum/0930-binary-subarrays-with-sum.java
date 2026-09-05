class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int prefix = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++){

            prefix += nums[i];

            int needed = prefix - goal;

            count += map.getOrDefault(needed, 0);

            map.put(prefix , map.getOrDefault(prefix, 0) +1);
        }
        return count;
    }
}