class Solution {
    public int[] plusOne(int[] digits) {
        

        for(int i = digits.length-1; i >= 0; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        // if all elements are 0 : Them create a n+1 array and make all elements 0 and add first ele = 1; 999 => 1000;

        int[] arr = new int[digits.length + 1];
        arr[0] = 1;

    return arr;
    }
}