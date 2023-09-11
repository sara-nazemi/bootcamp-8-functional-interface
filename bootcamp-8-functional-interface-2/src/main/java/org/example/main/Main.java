package org.example.main;

import org.example.operation.Operation;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Operation operation = new Operation(23.4, 14.65);

        operation.mathPerformance((x, y) -> x + y);
    }

}