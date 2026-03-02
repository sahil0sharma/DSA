package Basic.Basic_concept.Pattern;

public class pattern15 {

    void p15(int n){
         for(int i = 0 ; i < n ; i++){
             for(char j = 'A'; j < 'A'+ n-i; j++){
                 System.out.print(j);
             }
             System.out.println();
         }
    }
    public static void main(String[] args) {
        pattern15 p = new pattern15();

        p.p15(4);
    }
}
