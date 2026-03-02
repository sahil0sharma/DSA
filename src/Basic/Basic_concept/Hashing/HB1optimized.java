package Basic.Basic_concept.Hashing;

import java.util.*;
public class HB1optimized {

    public int second_highest_occouring_element(int[] nums) {


        // Array to hashmap
        Map<Integer, Integer> pair = new HashMap<>();
        for (int num : nums) {
            pair.put(num, pair.getOrDefault(num, 0) + 1);
        }

        // for maxfreq

        int maxfreq = Integer.MIN_VALUE;
        for (int i : pair.values()) {
            maxfreq = Math.max(i, maxfreq);
        }

        // for secMaxFreq

        int secMaxFreq = Integer.MIN_VALUE;
        for (int f : pair.values()) {
            if (f < maxfreq) {
                secMaxFreq = Math.max(secMaxFreq, f);
            }
            if (secMaxFreq == Integer.MIN_VALUE) {
                return -1;
            }
        }

        // for finding sec max element
        int ans = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> j : pair.entrySet()) {
            if (j.getValue() == secMaxFreq) {
                ans = Math.min(ans, j.getKey());
            }
        }
        return ans;
    }
    public static void main(String[] args) {

        HB1optimized hb1 = new HB1optimized();

        int[] arr = {1, 2, 2, 3, 3, 3};
        System.out.println(hb1.second_highest_occouring_element(arr));
    }
}
