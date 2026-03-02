package Basic.Basic_concept.Math1;
// perfect no.
// ex 6 its factor are 1 2 3 expects 6 | so adding 1 + 2 + 3 is -> 6 so this is perfect no.
public class F1_enhanced {

    public boolean perfect_no(int n ){
        if ( n < 1) return false;

        int sqrt = (int) (Math.sqrt(n));
        int sum = 1;
        for ( int i = 2; i <= sqrt; i++ ){
            if( n % i == 0) {
                sum += i;
                if (i != n / i) {
                    sum += n / i;
                }
            }
        }
        return sum == n;
    }

    public static void main(String[] args) {
        F1_enhanced f1Enhanced = new F1_enhanced();

        int n = 5;

        System.out.println(f1Enhanced.perfect_no(n));
    }
}
