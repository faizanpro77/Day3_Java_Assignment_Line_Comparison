package com.bridgelabz;

import static java.lang.Double.compare;

public class LineComparison {
    public static void main(String[] args) {

        System.out.println("Welcome to Line Comparison Computation Program");
        int x_1 = 20, x_2 = 25, y_1 = 30, y_2 = 35;
        int a_1 = 30, a_2 = 45, b_1 = 55, b_2 = 70;
        int v_x,v_y,v_a,v_b;
        v_x = x_2 - x_1;
        v_y = y_2 - y_1;
        v_a = a_2 - a_1;
        v_b = b_2 - b_1;
        double a = Math.pow(v_x,2);
        double b = Math.pow(v_y,2);
        double c = Math.pow(v_a,2);
        double d = Math.pow(v_b,2);
        double lineLength_1 = Math.sqrt(a+b);
        double lineLength_2 = Math.sqrt(c+d);
        System.out.println("length of a first line is : "+lineLength_1);
        System.out.println("length of a second line is : "+lineLength_2);
        int compareLength = (compare(lineLength_1, lineLength_2));
        System.out.println(compareLength);
        switch (compareLength) {
            case 0:
                System.out.println("Line 1 is equal to line 2");
                break;
            case 1:
                System.out.println("Line 1 is greater than line 2");
                break;
            default:
                System.out.println("Line 1 is less than line 2");
                break;
        }
    }
}
