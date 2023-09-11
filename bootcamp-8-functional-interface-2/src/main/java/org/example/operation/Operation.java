package org.example.operation;

public class Operation {
    private Double a;
    private Double b;

    public Operation(Double a, Double b) {
        this.a = a;
        this.b = b;
    }

    public void mathPerformance(MathOperation math) {

        Double avg = math.performOperation(a, b) / 2;

        System.out.println("average is : " + avg);
    }
}
