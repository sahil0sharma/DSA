class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        Set<Integer> frequencies = new HashSet<>();
        for (int freq : countMap.values()) {
            if (!frequencies.add(freq)) {
                return false;
            }
        }
        
        return true;
    }
}