package Basic.Basic_concept.Math.Arrays;

class solution{
    public int arrSum(int[] nums) {
        return sum(nums, 0);
    }

    private int sum(int[] nums, int left) {
        if (left >= nums.length) {
            return 0;
        }
        return nums[left] + sum(nums, left + 1);
    }
}
public class Sum_array {

    public static void main(String[] args) {

        solution s = new solution();

        int[] arr  = {1,2,3,4,5};
        System.out.println(s.arrSum(arr));


    }
}
