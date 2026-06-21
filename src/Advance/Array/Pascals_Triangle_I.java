package Advance.Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pascals_Triangle_I {

    public static int pascalTriangleI(int r, int c) {
        return nCr(r-1, c-1);
    }

    static int nCr(int n, int r){
        if(r > n - r) r = n - r;

        if(r == 1) return n;
        int res = 1;

        for(int i = 0; i < r; i++){
            res = res * (n-i);
            res = res / (i + 1);
        }

        return res;
    }


    public static void main(String[] args) {

        int r = 4, c = 2;
        System.out.println(Pascals_Triangle_I.pascalTriangleI(r,c));

    }
}
