package org.example.homework7;

public class task1 {

    public static void main(String[] args) {
        String input = "task1fromlesson7";
        char[] charsToRemove = {'a', 'o', 'n'};
        System.out.println("Original String: " + input);
        System.out.println("Characters to remove: " + new String(charsToRemove));
        String result = removeCharacters(input, charsToRemove);
        System.out.println("Modified String: " + result);
    }

    public static String removeCharacters(String input, char[] charsToRemove) {
        StringBuilder sb = new StringBuilder();
        for (char ch : input.toCharArray()) {
            boolean found = false;
            for (char c : charsToRemove) {
                if (ch == c) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
