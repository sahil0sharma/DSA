class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        while(true){
            slow = nextno(slow);
            fast = nextno(nextno(fast));

            if(fast == slow){
                return slow == 1;
            }
        }
     
    }

    public int nextno(int n){

        int sum = 0;
        while(n > 0){
            int ld = n % 10;
             sum += ld * ld;
             n /= 10;
        }
        return sum;
    }
}