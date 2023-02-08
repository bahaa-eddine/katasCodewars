package com.kata.craftmanship;

import java.util.Arrays;

public class PhoneNumberKata {

    private static final String PHONE_FORMAT = "(%d%d%d) %d%d%d-%d%d%d%d";

    public static String createPhoneNumber(int[] numbers) {
        // Your code here!
        StringBuilder resultBuilder = new StringBuilder();
        resultBuilder.append("(");
        resultBuilder.append(String.join("", Arrays.stream(numbers).limit(3).mapToObj(String::valueOf).toArray(String[]::new)));
        resultBuilder.append(") ");
        resultBuilder.append(String.join("", Arrays.stream(numbers).mapToObj(String::valueOf).reduce("", (a, b) -> a + b).substring(3,6)));
        resultBuilder.append("-");
        resultBuilder.append(String.join("", Arrays.stream(numbers).mapToObj(String::valueOf).reduce("", (a, b) -> a + b).substring(6,10)));
        return resultBuilder.toString();
    }

    public static String createPhoneBestNumber(int[] numbers) {
        Integer[] numbersInt = Arrays.stream(numbers).boxed().toArray(Integer[]::new);
        return String.format(PHONE_FORMAT, numbersInt);
    }
}
