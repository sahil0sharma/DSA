package Basic.Basic_concept.Math1;

public class A1 {
    public int countDigit(int n) {
        int count = 0;

        if (n == 0) {
            return 1;
        }

        for (int i = 1; i < n; i++) {
            count++;
        }
        return count;
    }


    public static void main(String[] args) {
        int n = 1400;

        A1 p1 = new A1();

        System.out.println(p1.countDigit(n));

    }

}
