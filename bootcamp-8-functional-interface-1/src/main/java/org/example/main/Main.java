package org.example.main;

import org.example.operation.Operation;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Operation operation = new Operation();

        operation.splitString((i) -> i.substring(3));

    }
}