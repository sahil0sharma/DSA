package Basic.Basic_concept.Math.Arrays;

public class Sub_array {

    public void subarray(int [] nums){

        int n = nums.length;
        int ele1 = 0;
        int ele2 = 1;

        for ( int i = 0; i < n - 1; i++){
            for( int j = 1; j < n ; j++) {
                if (nums[ele1] != nums[ele2]) {
                    if (nums[i] != nums[j]) {
//                        if (nums[ele1] < nums[ele2]) {
                            System.out.println(nums[i] + " " + nums[j]);
//                        }
                    }
                }
            }
            ele1++;
            ele2++;
        }
    }
    public static void main(String[] args) {
        Sub_array sb = new Sub_array();
        int[] arr ={2,3,4,6,8};
        sb.subarray(arr);


    }
}
