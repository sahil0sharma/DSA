package Basic.Basic_concept.Math.Strings;

import java.util.Arrays;
import java.util.List;

public class Reverse_string_brute {

    public void reverse_string(char[] nums){

        int left = 0;
        int right = nums.length - 1;

        while( left < right){

            char temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        Reverse_string_brute rev = new Reverse_string_brute();

        char[] arr = {'s', 'a', 'h', 'i', 'l'};

        System.out.println(Arrays.toString(arr));
    }
}
