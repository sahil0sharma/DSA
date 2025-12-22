package Basic.Basic_concept.Math;
// for check prime no
// a no. only divisible by itself no other
public class G1 {
    public boolean isPrime(int n) {
        if ( n < 2 ) return false;

        for ( int i = 2; i < n; i++){
            if ( n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args){
        G1 g1 = new G1();

        int n = 5;
        System.out.println(g1.isPrime(n));
    }
}

