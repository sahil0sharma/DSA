package Basic.Basic_concept.Math.Hashing;

import java.util.*;

public class HA1Optimized {

    public int countHahing(int[] nums ){

        int n = nums.length;
        int maxEle = 0;
        int maxFreq = 0;

        Map<Integer, Integer> list = new HashMap<>();

        for( int i = 0; i < n; i++){
            list.put(nums[i], list.getOrDefault(nums[i], 0) + 1 );
        }
        for(Map.Entry<Integer, Integer> loc : list.entrySet()) {
            int freq = loc.getValue();
            int ele = loc.getKey();

            if (freq > maxFreq){
                maxFreq = freq;
                maxEle = ele;
            } else if (freq == maxFreq) {
                maxEle = Math.min(ele, maxEle);

            }
        }
        return maxEle;
    }
    public static void main(String[] args) {

        HA1Optimized hoptimized = new HA1Optimized();

        int[] arr = { 1, 2, 3, 2, 2, 3};

        System.out.println(hoptimized.countHahing(arr));

    }
}
