package Basic.Basic_concept.Recursion;

public class sum_of_array {
        static int s = 0;
    public int sum_array(int[] nums , int n){

        if ( n == nums.length) return 0;

        return nums[n] + sum_array(nums, n + 1);

    }

    public static void main(String[] args) {
        sum_of_array s = new sum_of_array();
        int[] arr = {1,2,3};
        int n = 0;

        System.out.println(s.sum_array(arr,n));
    }
}
