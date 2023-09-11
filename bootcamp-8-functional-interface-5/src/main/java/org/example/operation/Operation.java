package org.example.operation;

import java.util.List;

public class Operation<T,R> {
    private List<T> arr;

    public Operation(List<T> arr) {
        this.arr = arr;
    }

    public R aggregate(ListAggregator<T,R> la){
        return la.aggregate(this.arr);
    }
}
