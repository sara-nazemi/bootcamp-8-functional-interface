package org.example;

import java.util.Random;
import java.util.function.Supplier;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Supplier<String> generatePassword = () -> {
            int generateLength = 3;

            // help from:
            // http://www.java2s.com/ref/java/java-math-random-character-generate.html

            // A - Z
            StringBuilder upper = new StringBuilder();
            for (int i = 0; i < generateLength; i++) {
                int number = 65 + (int) (Math.random() * (91 - 65));
                upper.append((char) (number));
            }

            // a - z
            StringBuilder lower = new StringBuilder();
            for (int i = 0; i < generateLength; i++) {
                int number = 97 + (int) (Math.random() * (122 - 97));
                lower.append((char) (number));
            }

            // 0 - 999
            Random random = new Random();
            int rndNum = random.nextInt(999);
            int digits = Math.abs(rndNum);

            return upper.toString() + lower + digits;
        };


        System.out.println(generatePassword.get());
        System.out.println(generatePassword.get());
        System.out.println(generatePassword.get());
    }
}