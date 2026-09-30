class Solution {
    public int maxDistance(int[] position, int m) {

        Arrays.sort(position);

        int left = 1;
        int right = position[position.length - 1] - position[0];

        while (left <= right) {

            int mid = left + (right - left) / 2;

            int last = position[0];
            int ball = 1;

            for (int i = 1; i < position.length; i++) {

                if (position[i] - last >= mid) {
                    ball++;
                    last = position[i];
                }
            }

            if (ball >= m) {
                // mid is possible, try a larger distance
                left = mid + 1;
            } else {
                // mid is impossible, try a smaller distance
                right = mid - 1;
            }
        }

        return right;
    }
}