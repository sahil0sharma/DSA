package Basic.Basic_concept.Pattern;

public class pattern18 {

    void p18(int n){
        char t = (char)('A' + n - 1);
        for(int i = 1; i <= n; i++){

            char start = (char)(t - i - 1);
            for(char j = start; j <= t; j++){
                System.out.print(t);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern18 p = new pattern18();
        int n = 4;
        p.p18(n);
    }

}
