package Basic.Basic_concept.Hashing;

public class HDbrute1 {

    public int sum_of_Max_min_element(int[] nums){

        int n = nums.length;
        int minE = Integer.MAX_VALUE;
        int minFre = Integer.MAX_VALUE;
        int maxE = Integer.MIN_VALUE;
        int maxfre = Integer.MIN_VALUE;

        boolean[] visited = new boolean[n];

        for(int i = 0; i < n; i++){
            if(visited[i]) continue;
            int freq = 0;

            for(int j = 0; j < n; j++){
                if(nums[i] == nums[j]){
                    visited[j] = true;
                    freq++;
                }
                if(freq > maxfre){
                    maxfre = freq;
                    minE = nums[i];
                }
                else if (freq < minFre) {
                    minFre = freq;
                    maxE = nums[i];
                }
                else if (freq == minE) {
                    minE = Math.min(minE, nums[i]);
                } else if (freq == maxfre){
                    maxE = Math.max(maxE, nums[i]);
                }

            }
        }
        return maxE + minE;
    }
    public static void main(String[] args) {

        HDbrute1 hd1 = new HDbrute1();
        int[] arr = { 1,2,3,2,1};

        System.out.println(hd1.sum_of_Max_min_element(arr));


    }
}
