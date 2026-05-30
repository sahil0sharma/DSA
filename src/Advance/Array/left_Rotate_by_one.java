package Advance.Array;

public class left_Rotate_by_one {

    public void rotateArrayByOne(int[] nums) {

        int temp1 = nums[0];
        for(int i = 0; i < nums.length-1; i++){
            nums[i] = nums[i+1];
        }
        nums[nums.length - 1] = temp1;

    }

    public static void main(String[] args) {

        left_Rotate_by_one sol = new left_Rotate_by_one();
        int[] arr = {1, 2, 3, 4, 5};

        sol.rotateArrayByOne(arr);
        for(int x : arr){
            System.out.print(x + " ");
        }
    }
}
