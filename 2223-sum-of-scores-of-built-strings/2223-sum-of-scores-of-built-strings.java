class Solution {
    public long sumScores(String s) {

        int n = s.length();
        int[] z = new int[n];
        long sum = n;

        int r = 0, l = 0;

        for(int i = 1; i < n; i++){

            if(i > r){
                l = r = i;

                while(r < n && s.charAt(r - l) == s.charAt(r)){
                    r++;
                }

                z[i] = r - l;
                r--;
            }else {

                z[i] = Math.min(z[i - l], r - i + 1); // from here condition splits 

                while(i + z[i] < n && s.charAt(z[i]) == s.charAt(z[i] + i)){
                    z[i]++;
                }

                if(i + z[i] - 1 > r){
                    l = i;
                    r = i + z[i] - 1;
                }
            }
            sum += z[i];
        }

        return sum;
    }
}