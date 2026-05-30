package Advance.Array;

public class ConsecetiveOnes {
        public int findMaxConsecutiveOnes(int[] nums) {

            int c1 = 0;
            int count = 0;
            for(int i = 0; i < nums.length; i++){

                if(nums[i] != 0 ){
                    count++;
                    if(count > c1 ){
                        c1 = count;
                    }

                } else count = 0;
            }
            return c1;
        }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1, 0, 0, 1, 1};

        // Create an instance of the Solution class
        ConsecetiveOnes sol = new ConsecetiveOnes();

        // Find and print the maximum consecutive 1s
        int ans = sol.findMaxConsecutiveOnes(nums);
        System.out.println("The maximum consecutive 1's are " + ans);
    }
}

