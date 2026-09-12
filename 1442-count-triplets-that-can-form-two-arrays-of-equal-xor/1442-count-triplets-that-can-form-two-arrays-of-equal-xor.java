class Solution {
    public int countTriplets(int[] arr) {

        Map<Integer, Integer> count = new HashMap<>();
        Map<Integer, Integer> sum = new HashMap<>();

        count.put(0, 1);
        sum.put(0, -1);

        int prefix = 0;
        int ans = 0;

        for (int i = 0; i < arr.length; i++) {

            prefix ^= arr[i];

           if (count.containsKey(prefix)) {
    ans += count.get(prefix) * (i - 1) - sum.get(prefix);
}
            count.put(prefix, count.getOrDefault(prefix, 0) + 1);
            sum.put(prefix, sum.getOrDefault(prefix, 0) + i);
        }

        return ans;
    }
}