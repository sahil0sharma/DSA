package Basic.Basic_concept.Pattern;
//1      1
//12    21
//123  321
//12344321
public class pattern12 {

    void inverted_triangle_no(int n){

        int space = 2 * (n - 1);

        for(int i = 1; i <= n; i++){

            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            for(int k = 1; k <= space; k++){
                System.out.print(" ");
            }
            for(int l = i; l >= 1; l--){
                System.out.print(l);
            }
            space -= 2;
            System.out.println();

        }
    }
    public static void main(String[] args) {
        pattern12 p = new pattern12();

        int n = 4;

        p.inverted_triangle_no(4);

    }
}
