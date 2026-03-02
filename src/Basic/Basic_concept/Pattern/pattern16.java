package Basic.Basic_concept.Pattern;

public class pattern16 {

    void p16(int n){
        char k ='A';
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(k);
            }
            k++;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern16 p = new pattern16();

        p.p16(4);
    }
}
