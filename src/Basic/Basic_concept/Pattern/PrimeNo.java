package Basic.Basic_concept.Pattern;

public class PrimeNo {

    int prime(int n){

        int count = 0;
        for(int i = 1; i < n; i++){
            for(int j = 2; j < i; j++){
                if(i%j ==  0){
                    count++;
                }
            }
        }
        return n-count;
    }

    public static void main(String[] args) {
        PrimeNo p = new PrimeNo();
        System.out.println(p.prime(10));
    }
}
