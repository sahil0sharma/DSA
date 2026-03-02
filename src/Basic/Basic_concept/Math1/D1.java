package Basic.Basic_concept.Math1;



public class D1 {

    public int factorial(int n) {
        int fact = 1;
        for( int i = 1; i <= n; i++){
            // fact = fact * n;
            // n = n - 1;
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args){
        D1 d1 = new D1();

        int n = 3;

        System.out.println(d1.factorial(n));

    }
}
