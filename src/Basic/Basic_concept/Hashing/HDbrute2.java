
package Basic.Basic_concept.Hashing;

public class HDbrute2 {

    public int sum_of_Max_min_element(int[] nums){

        int n = nums.length;
        int minFre = Integer.MAX_VALUE;
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

            }
            maxfre = Math.max(maxfre, freq);
            minFre = Math.min(minFre, freq);
        }

        return maxfre + minFre;
    }
    public static void main(String[] args) {

        HDbrute2 hd2 = new HDbrute2();
        int[] arr = { 1,2,3,2,1};

        System.out.println(hd2.sum_of_Max_min_element(arr));



    }
}
