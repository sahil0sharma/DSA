package Basic.Basic_concept.Math1;

public class H1Better {

    public int GDC(int n1, int n2){
        int gdc = 1;

        for ( int i = Math.min(n1, n2); i >= 1; i--){
            if (n1 % i == 0 && n2 % i == 0){
                gdc = i;
            }
        }
        return gdc;
    }
    public static void main(String[] args) {
        H1Better h1b = new H1Better();
        int n1 = 6, n2 = 12;
        System.out.println(h1b.GDC(n1, n2));
    }
}
