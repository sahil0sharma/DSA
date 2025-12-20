package Basic.Basic_concept.Math;


public class A3 {

    public int Sum_of_Digits_in_a_Given_Number(int n){

        n = Math.abs(n);
        if ( n == 0 ) return 0;
        int sum = 0;

        while (n > 0 ){
             sum += (n % 10);
             n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {

        A3 p3 = new A3();

        int n = 1234;

        System.out.println(p3.Sum_of_Digits_in_a_Given_Number(n));

    }
}
