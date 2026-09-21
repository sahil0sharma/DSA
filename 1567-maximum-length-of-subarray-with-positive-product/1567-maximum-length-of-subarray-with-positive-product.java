class Solution {
    public int getMaxLen(int[] nums) {

        int pos = 0;  // longest positive-product subarray ending here
        int neg = 0;  // longest negative-product subarray ending here

        int answer = 0;

        for (int num : nums) {

            if (num == 0) {
                pos = 0;
                neg = 0;
            }
            else if (num > 0) {

                // Positive keeps the sign the same
                pos = pos + 1;

                if (neg > 0) {
                    neg = neg + 1;
                }

            }
            else { // num < 0

                int oldPos = pos;
                int oldNeg = neg;

                // Negative flips the sign
                if (oldNeg > 0) {
                    pos = oldNeg + 1;
                } else {
                    pos = 0;
                }

                neg = oldPos + 1;
            }

            answer = Math.max(answer, pos);
        }

        return answer;
    }
}