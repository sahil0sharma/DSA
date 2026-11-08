import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    private String search(int L, int n, String s, int[] nums) {
        long base = 26;
        long mod = 1_000_000_007L;
        long h = 1;

        // Compute base^(L-1) % mod
        for (int i = 0; i < L - 1; ++i) {
            h = (h * base) % mod;
        }

        long currentHash = 0;
        // Map hash value -> list of starting indices to handle collisions
        Map<Long, List<Integer>> seen = new HashMap<>();

        // Compute hash for the first window of length L
        for (int i = 0; i < L; ++i) {
            currentHash = (currentHash * base + nums[i]) % mod;
        }
        seen.computeIfAbsent(currentHash, k -> new ArrayList<>()).add(0);

        // Slide the window across the string
        for (int start = 1; start <= n - L; ++start) {
            currentHash = (currentHash - nums[start - 1] * h % mod + mod) % mod;
            currentHash = (currentHash * base + nums[start + L - 1]) % mod;

            if (seen.containsKey(currentHash)) {
                String candidate = s.substring(start, start + L);
                for (int prevStart : seen.get(currentHash)) {
                    if (s.substring(prevStart, prevStart + L).equals(candidate)) {
                        return candidate;
                    }
                }
            }
            seen.computeIfAbsent(currentHash, k -> new ArrayList<>()).add(start);
        }
        return null;
    }

    public String longestDupSubstring(String s) {
        int n = s.length();
        int[] nums = new int[n];
        for (int i = 0; i < n; ++i) {
            nums[i] = s.charAt(i) - 'a';
        }

        int left = 1, right = n;
        String longest = "";

        // Binary search on the length of the duplicate substring
        while (left <= right) {
            int mid = left + (right - left) / 2;
            String dup = search(mid, n, s, nums);

            if (dup != null) {
                longest = dup;
                left = mid + 1; // Try longer substrings
            } else {
                right = mid - 1; // Try shorter substrings
            }
        }

        return longest;
    }
}