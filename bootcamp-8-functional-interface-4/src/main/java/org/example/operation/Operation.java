package org.example.operation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Operation<T> {
    private List<T> strings;

    public Operation(List<T> strings) {
        this.strings = strings;
    }

    public List<T> stringOperation(Predicate<T> pred) {
        List<T> newArray = new ArrayList<>();
        for (T i : strings) {
            if (pred.test(i))
                newArray.add(i);
        }
        return newArray;
    }
}
