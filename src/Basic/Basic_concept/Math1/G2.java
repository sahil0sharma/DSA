package Basic.Basic_concept.Math1;

//Count of Prime Numbers till N
public class G2 {

    public boolean prime_check(int n ){

        if ( n <= 1) return false;

        int sqrt = (int) ( Math.sqrt(n));   // making this method to check prime no.s
        for ( int i = 2; i * i <= n; i++){
            if ( n % i == 0){
                return false;
            }
        }
        return true;
    }

    public int count_prime(int n){
        int count = 0;
        for ( int i = 2; i <= n; i++){
            if ( prime_check(i)) {          // making this method to count prime no.s
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        G2 g2 = new G2();

        int n = 20;
        System.out.println(g2.count_prime(n));
    }
}
