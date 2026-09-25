class Solution {
    public int smallestIndex(int[] nums) {
        
        int min = Integer.MAX_VALUE;


        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            int sum = 0;

            while(num > 0){
                int ld = num % 10;
                sum += ld;
                num /= 10;
            }

            if(sum == i){
                min = Math.min(sum, min);
            }
        }

        return min == Integer.MAX_VALUE? -1 : min;
    }
}