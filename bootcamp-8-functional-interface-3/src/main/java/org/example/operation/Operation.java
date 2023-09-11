package org.example.operation;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Operation {
    private List<Integer> list;

    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

    public List<Integer> arrayOperation(NumberPredicate num) {
        List<Integer> evens = new ArrayList<>();
        for (Integer i : list) {
            if (num.test(i)) {
                evens.add(i);
            }
        }
        return evens;
    }


}
