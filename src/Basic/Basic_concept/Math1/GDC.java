package Basic.Basic_concept.Math1;

public class GDC {

    int GDC(int n1, int n2){
        int ln1 = 0;
        int ln2 = 0;
        int lcd = 0;

        for(int i = 1; i < Math.max(n1,n2); i++){
            if(n1%i == 0 && n2%i == 0){
                ln1 = i;
                ln2 = i;
                if(ln1 == ln2){
                    lcd = ln1;
                }
            }
        }
        return lcd;
    }

    public static void main(String[] args) {
        GDC g = new GDC();
        System.out.println(g.GDC(4,6));


    }
}
