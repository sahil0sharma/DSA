class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        int left = 1;
        int right = x / 2;
        int ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Use long to prevent integer overflow when computing mid * mid
            long square = (long) mid * mid;

            if (square == x) {
                return mid;
            } else if (square < x) {
                ans = mid;        // Potential answer, try finding a larger one
                left = mid + 1;
            } else {
                right = mid - 1;   // mid^2 is too large, search lower half
            }
        }

        return ans;
    }
}