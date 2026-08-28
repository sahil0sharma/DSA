class Solution {
    public int totalFruit(int[] fruits) {
        int length = 0;
        int j = 0;
        int maxc = 0;
        int d = 0;
        
        int[] hash = new int[fruits.length];
        int b1 = 0, b2 = 0;
        for(int i = 0; i < fruits.length; i++){
                if(hash[fruits[i]] == 0){
                    d++;
                }
                hash[fruits[i]]++;

                while(d > 2){
                    hash[fruits[j]]--;
                    if(hash[fruits[j]] == 0){
                        d--;
                    }
                    j++;
                }

                
            length = Math.max(length, i - j + 1);

        }

        return length;

    }
}