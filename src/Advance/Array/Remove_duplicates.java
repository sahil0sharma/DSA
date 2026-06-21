package Advance.Array;

public class Remove_duplicates {

    public int removeDuplicates(int[] nums) {

        int j = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[j] != nums[i]){
                j++;
                nums[j] = nums[i];

            }
        }
        return j+1;
    }



    public static void main(String[] args) {
        int[] arr1 = {-2, 2, 4, 4, 4, 4, 5, 5};
        int[] arr = {0, 0, 3, 3, 5, 6};

        Remove_duplicates sol = new Remove_duplicates();
        System.out.println( sol.removeDuplicates(arr));

        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
