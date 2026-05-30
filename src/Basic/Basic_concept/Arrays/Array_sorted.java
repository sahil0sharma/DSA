package Basic.Basic_concept.Arrays;

public class Array_sorted {

        public boolean sorting(int[] arr){

            for(int i = 0; i < arr.length - 1; i++){
//                for(int j = i + 1; j < arr.length; j++){
                    if ( arr[i] > arr[i+1]){
                        return false;
                    }
                }
//            }
            return true;
        }
    public static void main(String[] args) {
        Array_sorted a = new Array_sorted();

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(a.sorting(arr));
    }
}
