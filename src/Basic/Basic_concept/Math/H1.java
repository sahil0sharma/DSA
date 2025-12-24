package Basic.Basic_concept.Math;
//GCD of Two Numbers


public class H1 {

    public int GDC(int n1, int n2){

//        if ( n1 < 1 && n2 < 1) return 1;
        int gdc = 1;
        for( int i = 2; i < Math.min(n1,n2); i++){
            if ( n1 % i == 0 && n2 % i ==0){
                gdc = i;
            }
        }
        return gdc;
    }

    public static void main(String[] args) {
        H1 h1 = new H1();
        int n1 = 6, n2 = 12;

        System.out.println(h1.GDC(n1,n2));



    }

}
