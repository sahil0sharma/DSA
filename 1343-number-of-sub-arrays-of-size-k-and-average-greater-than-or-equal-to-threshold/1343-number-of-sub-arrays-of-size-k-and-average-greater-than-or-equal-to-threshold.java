class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {

        int sum = 0;
        for(int i = 0; i < k; i++){
            sum += arr[i];
        }

        int avg = 0;
        int greater = 0;
   

        if(sum / k >= threshold){
            greater++;
        }

        for(int i = k; i < arr.length; i++){

            sum += arr[i];
            sum -= arr[i-k];

            if(sum / k >= threshold){
                greater++;
            }

        }

        
        return greater;
    }
}