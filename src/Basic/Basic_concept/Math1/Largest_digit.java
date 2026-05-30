package Basic.Basic_concept.Math1;

public class Largest_digit {

   static int large_digit(int n){

        int l_d = Integer.MIN_VALUE;
        while(n > 0){
            int ld =  n % 10;
            if(ld > l_d){
                l_d = ld;
            }
            n = n / 10;
        }
        return l_d;
    }
    public static void main(String[] args) {

        System.out.println(Largest_digit.large_digit(39825));

    }
}
