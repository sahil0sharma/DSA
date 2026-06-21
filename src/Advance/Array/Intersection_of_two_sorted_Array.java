package Advance.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class Intersection_of_two_sorted_Array {

    public int[] intersectionArray(int[] nums1, int[] nums2) {

        ArrayList<Integer> intersection = new ArrayList<>();

        int i = 0, j = 0;
        int n1 = nums1.length;
        int n2 = nums2.length;


        while(i < n1 && j < n2){
            if(nums1[i] < nums2[j]) {
                i++;

            } else if(nums1[i] > nums2[j]) {
                j++;

            }
             else {
                intersection.add(nums1[i]);
                i++;
                j++;
            }
        }

        int[] con = new int[intersection.size()];
        for(int k = 0; k < intersection.size(); k++){
            con[k] = intersection.get(k);
        }

        return con;
    }
    public static void main(String[] args) {

        int[] nums1 = {1, 2, 2, 3, 3, 3};
        int[] nums2 = {2, 3, 3, 4, 5, 7};

        Intersection_of_two_sorted_Array i = new Intersection_of_two_sorted_Array();

        System.out.println(Arrays.toString(i.intersectionArray(nums1,nums2)));

    }

}
