package Basic.Basic_concept.Math.Hashing;

import java.util.*;

public class HDoptimal {

    public int sum_of_frequency_max_and_min(int[] nums){

        int n = nums.length;
        int maxF = Integer.MIN_VALUE;
        int minF = Integer.MAX_VALUE;

        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        for(Map.Entry<Integer, Integer> j: freq.entrySet()){
            maxF = Math.max(maxF, j.getValue());
            minF = Math.min(minF, j.getValue());
        }

        return maxF + minF;
    }
    public static void main(String[] args) {

        HDoptimal hDoptimal = new HDoptimal();
        int[] arr = {1,2,3,2,1};

        System.out.println(hDoptimal.sum_of_frequency_max_and_min(arr));


    }
}
