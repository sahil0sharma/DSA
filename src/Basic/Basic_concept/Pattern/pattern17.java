package Basic.Basic_concept.Pattern;

public class pattern17 {

    void p17(int n){

        for(int i = 1; i <= n; i++){
            for(int j = 0; j <= n-i-1; j++){
                System.out.print(" ");
            }
            for(int k = 0; k < i; k++){
                System.out.print((char)('A' + k));
            }
            for(int l = i - 2; l >= 0; l--){
                System.out.print((char)('A' + l));
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern17 p = new pattern17();

        p.p17(4);
    }
}
