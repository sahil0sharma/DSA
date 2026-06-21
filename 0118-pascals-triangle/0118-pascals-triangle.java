class Solution {
    public static List<Integer> getRow(int rowIndex) {

        List<Integer> list = new ArrayList<>();

        long ans = 1;
        list.add(1);

        for(int i = 1; i <= rowIndex; i++){
            ans = ans * (rowIndex - i + 1);
            ans = ans / i;
            list.add((int) ans);
        }

        return list;
    }

    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> list2 = new ArrayList<>();

        for(int row = 0; row < numRows; row++){
            list2.add(getRow(row));
        }
         return list2;
    }
}