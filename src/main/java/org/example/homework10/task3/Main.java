package org.example.homework10.task3;

    import java.util.Arrays;

    public class Main {
        public static void main(String[] args) {
            splitAndPrint("This is a sample sentence");
        }

        public static void splitAndPrint(String sentence) {
            Arrays.stream(sentence.split(" "))
                    .forEach(word -> System.out.println(word));
        }
    }

