package Basic.Basic_concept.Math;
// LCM smallest no. that both no. can reach

public class I1 {

    public int LCM( int n1, int n2){

        int lcm = 1;
        int n = Math.max(n1,n2);
        int i = 2;

       while ( true){
           int mul = n * i;
            int mult = Math.max( n1 , n2) * i;

            if ( mult % n1 == 0 && mult % n2 == 0 ){
                lcm = mult;
                break;
            }
            i++;
        }
       return lcm;
    }

    public static void main(String[] args) {
        I1 i1 = new I1();
        int n1 = 12, n2 = 18;

        System.out.println(i1.LCM(n1,n2));
    }
}
