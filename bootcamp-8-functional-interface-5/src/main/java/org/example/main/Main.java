package org.example.main;

import org.example.operation.Operation;

import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Operation<Integer, Boolean> operation = new Operation<>(Arrays.asList(1, 2, 3, 4));
        operation.aggregate((lst) -> {
            lst.addAll(Arrays.asList(5, 6, 7));
            return true;
        });
    }
}