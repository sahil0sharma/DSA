package Basic.Basic_concept.Math1;

public class LCM {

    int lcm(int n1, int n2){
        int n = Math.max(n1, n2);
        int min = Integer.MAX_VALUE;

        for(int i = 2; i < n; i++){
            if(n % i == 0){
                if(min > i){
                    min = i;
                }
            }
        }

        return min * n;
    }

    public static void main(String[] args) {
        LCM l = new LCM();
        System.out.println(l.lcm(3,5));
    }
}
