package Basic.Basic_concept.Math;
//Divisors of a Number
//You are given an integer n. You need to find all the divisors of n. Return all the divisors of n as an array or list in a sorted order.

import java.util.Arrays;

public class J1 {

    public int[] divisor(int n) {

        int count = 0;
        int[] temp = new int[n];
        for (int i = 1; i <= n; i++){
            if(n % i == 0){
                temp[count++] = i;
            }
        }
        return Arrays.copyOf(temp,count);
    }
    public static void main(String[] args) {
        J1 j1 = new J1();

        int n = 6;

        int[] ans = j1.divisor(n);
        for (int an : ans) {
            System.out.print(an + " ");
        }

    }
}
