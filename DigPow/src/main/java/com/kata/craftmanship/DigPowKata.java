package com.kata.craftmanship;

public class DigPowKata {

    public static long digPow(int n, int p) {
        // your code
        Double result = 0D;
        for (int i = 0; i < String.valueOf(n).length(); i++) {
            result += Math.pow(Double.valueOf(String.valueOf(n).charAt(i)+"d"),p);
            p++;
        }
        return result % n == 0 ? (long) (result / n) : -1;
    }

}
