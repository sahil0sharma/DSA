package Basic.Basic_concept.Math.Hashing;

public class HA1Brute2 {

    public int countHashing(int[] nums){

        int n = nums.length;
        int maxFreq = 0;
        int maxEle = 0;

        boolean[] visited = new boolean[n];

        for( int i = 0; i < n; i++){
            if (visited[i]) continue;

            int freq = 0;

            for( int j = 0; j < n; j++){
                if(nums[i] == nums[j]){
                    freq++;
                    visited[j] = true;
                }
                if(freq > maxFreq){
                    maxFreq = freq;
                    maxEle = nums[i];
                }
                else if(freq == maxFreq){
                    maxEle = Math.min(maxEle, nums[i]);
                }
            }
        }
        return maxEle;
    }
    public static void main(String[] args) {

        HA1Brute2 h2 = new HA1Brute2();
        int[] arr = {1, 2, 3, 2, 1};

        System.out.println(h2.countHashing(arr));

    }
}
