package Advance.Array;

public class Move_zero_to_end {

    public void moveZeroes(int[] nums) {

        int j = 0;
        for(int i = 0; i <= nums.length-1; i++) {
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
    public static void main(String[] args) {

        Move_zero_to_end sol = new Move_zero_to_end();

        int[] arr = {0, 0, 0, 1, 3, -2};
        sol.moveZeroes(arr);

        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
