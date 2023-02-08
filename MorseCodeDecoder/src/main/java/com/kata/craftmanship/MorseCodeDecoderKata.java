package com.kata.craftmanship;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MorseCodeDecoderKata {
    private static Map<String, String> morseCodes = new HashMap<String, String>();

    static {
        String[] alpha = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
                "s", "t", "u", "v", "w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", " ", "!", ".",
                "SOS" };
        String[] dottie = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
                "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
                "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----", "|", "-.-.--",
                ".-.-.-", "...---..." };
        for (int i = 0; i < alpha.length; i++) {
            morseCodes.put(dottie[i], alpha[i]);
        }
    }

    public static String decode(String morseCode) {
        // your brilliant code here, remember that you can access the preloaded Morse code table through MorseCode.get(code)
        return Arrays.stream(morseCode.split("  "))
                .map(str -> decodeByWord(str))
                .collect(Collectors.joining(" ")).trim();
    }

    public static String decodeByWord(String morseCode) {
        return Arrays.stream(morseCode.split(" "))
                .map(str -> decoder(str).toUpperCase())
                .collect(Collectors.joining(""));
    }

    public static String decoder (String toEncode) {
        return morseCodes.getOrDefault(toEncode, "");
    }
}