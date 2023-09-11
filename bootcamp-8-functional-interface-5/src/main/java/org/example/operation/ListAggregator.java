package org.example.operation;

import java.util.List;
@FunctionalInterface
public interface ListAggregator<T,R> {
    R aggregate(List<T> list);
}
