package com.kata.craftmanship;

public class DisemvowelTrollsKata {

    public static String disemvowel(String str) {
        // Code away...
        return str.replaceAll("(?i)[aeiou]","");
    }

}
