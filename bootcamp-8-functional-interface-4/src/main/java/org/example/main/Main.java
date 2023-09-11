package org.example.main;

import org.example.operation.Operation;

import java.util.Arrays;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Operation<String> operation = new Operation<>(Arrays.asList("hello", "new", "life", "and", "bye", "lazy"));

        List<String> strs = operation.stringOperation((i) -> i.length() == 3);
        System.out.println(strs);

    }
}