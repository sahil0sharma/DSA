class Solution {
    public int compress(char[] chars) {

    int i = 0;
    int j = 0;

    while(i < chars.length){
        char c = chars[i];
        int count = 0;

        while(i < chars.length && chars[i] == c){
            count++;
            i++;
        }
        
       chars[j] = c;
        j++;

        if (count > 1) {
            String num = String.valueOf(count);

            for (char digit : num.toCharArray()) {
                chars[j] = digit;
                j++;
            }
        }
    }
        
        return j;
    }
}