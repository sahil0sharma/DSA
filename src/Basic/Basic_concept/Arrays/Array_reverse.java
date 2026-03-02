package Basic.Basic_concept.Arrays;

import java.util.Arrays;

public class Array_reverse {

    public void rev( int[] arr){


        for( int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {

        Array_reverse r = new Array_reverse();

        int[] arr = { 1,2,3,4,5};

     r.rev(arr);

    }
}
