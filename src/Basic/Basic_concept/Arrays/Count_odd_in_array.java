package Basic.Basic_concept.Arrays;

public class Count_odd_in_array {
    public int countOdd(int[] arr, int n) {

        int count = 0;
        for ( int i = 0; i < arr.length ; i++){
            if( arr[i] % 2 != 0 ){
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        Count_odd_in_array c = new Count_odd_in_array();

        int[] arr = {1,2,3,4,5};
        int n = 5;
        System.out.println(c.countOdd(arr,n));
    }
}
