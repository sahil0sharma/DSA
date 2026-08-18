class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(arr);

        int i = 0;
        int j = 0;
        int absdiff = Integer.MAX_VALUE;

        while(i < arr.length - 1){
                j = i+1;
            int diff = arr[j] - arr[i];

            if(diff < absdiff){
                absdiff = diff;
            }
            i++;
   
        }

        for(int k = 0; k < arr.length-1; k++){
            int diff = arr[k+1] - arr[k];
            if(diff == absdiff){
                List<Integer> temp = Arrays.asList(arr[k],arr[k+1]);
                list.add(temp);
            }
        }

        return list;

    }
}