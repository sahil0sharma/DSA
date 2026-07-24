class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+ 1);
        }
        int max = 0;
        for(Map.Entry<Integer, Integer> num : map.entrySet()){
            if (num.getValue() > n / 2) {
                return num.getKey();
            }
        }
        return -1;
       
    }
}