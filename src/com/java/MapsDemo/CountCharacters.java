package com.java.MapsDemo;

import java.util.HashMap;
import java.util.Map;

public class CountCharacters {
    public static void main(String[] args) {
        String input = "characters";
        Map<Character, Integer> count = countCharacters(input);
        System.out.println(count);
    }

    private static Map<Character, Integer> countCharacters(String input) {
        Map<Character, Integer> count = new HashMap<>();
        char[] charArray = input.toCharArray();
        int counter = 0;
        for (int i = 0; i <= charArray.length - 1; i++) {
            if (count.containsKey(charArray[i])) {
                count.put(charArray[i], count.get(charArray[i]) + 1);
            } else {
                count.put(charArray[i], 1);
            }
        }
        return count;
    }
}
