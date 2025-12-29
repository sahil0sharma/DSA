package Basic.Basic_concept.Math.Hashing;

import java.util.*;
//Second Highest Occurring Element
//Given an array of n integers, find the second most frequent element in it.
//If there are multiple elements that appear second most frequent times, find the smallest of them.
//If second most frequent element does not exist return -1.
public class HB1Brute {
    /* Function to get the second highest
    occurring element in array */
    public int secondMostFrequentElement(int[] nums) {

        int n = nums.length;
        boolean[] visited = new boolean[n];

        int maxFreq = Integer.MIN_VALUE;
        int secondMaxFreq = Integer.MIN_VALUE;

        // 1️⃣ First pass: find max frequency
        for (int i = 0; i < n; i++) {
            if (visited[i]) continue;

            int freq = 0;
            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j]) {
                    freq++;
                    visited[j] = true;
                }
            }
            maxFreq = Math.max(maxFreq, freq);
        }

        // 2️⃣ Second pass: find second max frequency
        Arrays.fill(visited, false);

        for (int i = 0; i < n; i++) {
            if (visited[i]) continue;

            int freq = 0;
            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j]) {
                    freq++;
                    visited[j] = true;
                }
            }

            if (freq < maxFreq) {
                secondMaxFreq = Math.max(secondMaxFreq, freq);
            }
        }

        if (secondMaxFreq == Integer.MIN_VALUE) return -1;

        // 3️⃣ Third pass: find smallest element with second max frequency
        Arrays.fill(visited, false);
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (visited[i]) continue;

            int freq = 0;
            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j]) {
                    freq++;
                    visited[j] = true;
                }
            }

            if (freq == secondMaxFreq) {
                ans = Math.min(ans, nums[i]);
            }
        }

        return ans;
    }
    public static void main (String[] args) {
            HB1Brute hb1 = new HB1Brute();

            int[] arr = {4,4,5,5,6,7};

            System.out.println(hb1.secondMostFrequentElement(arr));


        }
    }

