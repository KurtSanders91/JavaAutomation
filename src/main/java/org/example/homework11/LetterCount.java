package org.example.homework11;
import java.util.HashMap;
import java.util.Map;

public class LetterCount {

    public static void countLetters(String input) {
        Map<Character, Integer> letterCounts = new HashMap<>();

        input = input.toLowerCase();

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                letterCounts.put(c, letterCounts.getOrDefault(c, 0) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : letterCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}