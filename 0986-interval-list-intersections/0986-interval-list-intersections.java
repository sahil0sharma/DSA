class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        
        int i = 0;
        int j = 0; 

        int n = firstList.length;
        int m = secondList.length;

        List<int[]> list = new ArrayList<>();

        while(i < n && j < m){

            // finding closed Interval that overlaps max of second list and min of first list si overlapping 
            // [1,3] - - - 
            // [2,4]   - - - starting index of first < second so from second it will start and 
                            // end index first < second so till 3 it will end found overlap

            int start = Math.max(firstList[i][0], secondList[j][0]);
            int end = Math.min(firstList[i][1], secondList[j][1]);

            if(start <= end){
                list.add(new int[]{start,end});
            }

            // moving Pointer

            if(firstList[i][1] < secondList[j][1]){
                i++;
            } else if(firstList[i][1] > secondList[j][1]){
                j++;
            } else {
                i++;
                j++;
            }


        }
        return list.toArray(new int[list.size()][]);
    }
}