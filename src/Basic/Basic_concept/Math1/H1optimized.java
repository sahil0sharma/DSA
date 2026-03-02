package Basic.Basic_concept.Math1;
//Euclidean Algorithm: if a > b then ( a - b , b) the GDC is b

public class H1optimized {

    public int GDC(int n1, int n2) {

        while (n1 > 0 && n2 > 0) {

            if (n1 > n2){
                n1 = n1 % n2;
            }
            else
            {
                n2 = n2 % n1;
            }
        }
        if (n1 == 0) return n2;

        return n1;
    }
    public static void main(String[] args) {
        H1optimized h1o = new H1optimized();

        int n1 = 12, n2 = 2;

        System.out.println(h1o.GDC(n1,n2));

    }
}
