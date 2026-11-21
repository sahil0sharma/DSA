
class Solution {
    public String frequencySort(String s) {

        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        List<Character> list = new ArrayList<>(map.keySet());

        list.sort((a, b) -> map.get(b) - map.get(a));

        StringBuilder r = new StringBuilder();

        for (char c : list) {
            int frequency = map.get(c);

            for (int i = 0; i < frequency; i++) {
                r.append(c);
            }
        }

        return r.toString();
    }
}
