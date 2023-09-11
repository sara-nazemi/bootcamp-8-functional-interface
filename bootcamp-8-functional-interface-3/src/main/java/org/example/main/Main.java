package org.example.main;

import org.example.operation.Operation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Operation operation = new Operation();
        List<Integer> list = Arrays.asList(12, 89, 70, 24, 5, 10);
        operation.setList(list);

        // functional method pass
        List<Integer> integers = operation.arrayOperation((x) -> x % 2 == 0);
        System.out.println(integers);

    }
}