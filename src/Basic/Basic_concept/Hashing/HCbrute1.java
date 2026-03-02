package Basic.Basic_concept.Hashing;

public class HCbrute1 {

    public int lowest_O_element(int[] nums){

        int n = nums.length;;
        int minE = 0;
        int minFre = 0;

        boolean[] visited = new boolean[n];

        for(int i = 0; i < n; i++){
            if(visited[i]) continue;
            int freq = 0;
        for( int j = 0; j < n; j++){
            if( nums[i] == nums[j]) {
                freq++;
                visited[j] = true;
            }
            if(freq > minFre){
                minFre = freq;
                minE = nums[i];
            }
            else if ( freq == minFre){
                minE = Math.min(minE,nums[j]);
            }
        }
        }
        return minE;
    }
    public static void main(String[] args) {

        HCbrute1 hc1 = new HCbrute1();

        int[] arr = {1,2,3,2,1};
        System.out.println(hc1.lowest_O_element(arr));

    }
}
