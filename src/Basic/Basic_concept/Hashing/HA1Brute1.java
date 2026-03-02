package Basic.Basic_concept.Hashing;

public class HA1Brute1 {

    public int hashing(int[] nums){

        int n = nums.length;
        int maxfreq = 0;
        int maxEle = nums[0];

        for( int i = 0; i < n; i++){
            int freq = 0;

            for( int j = 0; j < n ; j++){
                if( nums[i] == nums[j]){
                    freq++;
                }
                if ( freq > maxfreq){
                    maxfreq = freq;
                    maxEle = nums[i];
                }
                else if ( freq == maxfreq){
                    maxEle = Math.min(maxEle, nums[i]);
                }
            }
        }
        return maxEle;
    }
    public static void main(String[] args) {

        HA1Brute1 h1 = new HA1Brute1();
        int[] arr = {1, 2, 3, 3, 2, 2};

        System.out.println(h1.hashing(arr));

    }
}
