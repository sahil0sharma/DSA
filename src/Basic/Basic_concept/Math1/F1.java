package Basic.Basic_concept.Math1;
// perfect no.
// ex 6 its factor are 1 2 3 expects 6 | so adding 1 + 2 + 3 is -> 6 so this is perfect no.
public class F1 {
    public boolean isPerfect(int n) {
        int sum = 0;
        int copy = n;

        for( int i = 1; i < n ; i++ ){
            if ( n % i == 0){
                sum = sum + i;
            }
        }
        return copy == sum;
    }
    public static void main(String[] args) {
        F1 f1 = new F1();

        int n = 5;

        System.out.println(f1.isPerfect(n));


    }
}
