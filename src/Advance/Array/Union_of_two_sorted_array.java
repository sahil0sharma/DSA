package Advance.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Union_of_two_sorted_array {
    public int[] unionArray(int[] a, int[] b) {

        List<Integer> union = new ArrayList<>();
        int i = 0, j = 0;
        int n1 = a.length;
        int n2 = b.length;

        while ( i < n1 && j < n2){
            if(a[i] != b[j]){
                if(union.isEmpty() || union.getLast() != a[i]) {
                    union.add(a[i]);
                }
                    i++;
                } else {
                    if(union.isEmpty() || union.getLast() != b[j]) {
                        union.add(b[j]);
                    }
                        j++;
                }

        }

        while(i < n1){
            if(union.isEmpty() || union.getLast() != a[i]) {
                union.add(a[i]);
            }
                i++;
        }
        while(j < n2){
            if(union.isEmpty() || union.getLast() != b[j]) {
                union.add(b[j]);
            }
            j++;
        }

        int[] unionA = new int[union.size()];
        for(int k = 0; k < union.size(); k++){
            unionA[k] = union.get(k);
        }
        return unionA;
    }

    public static void main(String[] args) {

        int[] nums1 = {3, 4, 6, 7, 9, 9};
        int[] nums2 = {1, 5, 7, 8, 8};

        Union_of_two_sorted_array sol = new Union_of_two_sorted_array();
        System.out.println(Arrays.toString(sol.unionArray(nums1, nums2)));
    }
}
