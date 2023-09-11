package org.example.operation;

import java.util.Arrays;
import java.util.Scanner;

public class Operation {
    Scanner in = new Scanner(System.in);

    public void splitString(StringOperation str) {
        System.out.println("enter sentence :");
        String s = in.nextLine();
        System.out.println("hello" + str.performOperation(s));
    }
}

