package Basic.Basic_concept.Pattern;
//A
//AB
//ABC
//ABCD
public class pattern14 {

    void p14(int n ){

        for(int i = 0; i < n; i++){
            for(char j = 'A'; j <= 'A' + i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern14 p = new pattern14();

        p.p14(4);
    }
}
