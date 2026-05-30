package Basic.Basic_concept.Math1;

public class Perfectno {

    static boolean perfect(int n){

        int sum = 0;
        for(int i = 1; i < n; i++){
            if((n % i) == 0){
                sum = sum + i;

            }

        }
        return n == sum;
    }
    public static void main(String[] args) {

        System.out.println(Perfectno.perfect(6));

    }

}
