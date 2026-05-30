package Advance.Array;

public class Rotate_array_by_k_place {

    void reverse(int[] nums, int start, int end){

        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public void rotateArray(int[] nums, int k) {
    int n = nums.length;
     k = k % n;

     reverse(nums, 0, k-1);
     reverse(nums, k,n-1);
     reverse(nums, 0, n-1);

    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 1, 5, 3, -5};
        int k = 8;
        Rotate_array_by_k_place sol = new Rotate_array_by_k_place();
        sol.rotateArray(arr, k);

        for(int i: arr){
            System.out.print(i + " ");
        }
    }
}
