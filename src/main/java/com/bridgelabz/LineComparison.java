package com.bridgelabz;

import java.util.Objects;
import static java.lang.Double.compare;

public class LineComparison {

    private int x_1,x_2,y_1,y_2,a_1,a_2,b_1,b_2;
    public LineComparison(int x_1,int x_2,int y_1,int y_2,int a_1,int a_2,int b_1,int b_2) {
        this.x_1 = x_1;
        this.x_2 = x_2;
        this.y_1 = y_1;
        this.y_2 = y_2;
        this.a_1 = a_1;
        this.a_2 = a_2;
        this.b_1 = b_1;
        this.b_2 = b_2;
    }
    public void equalityComparison() {
        System.out.println("Welcome to Line Comparison Computation Program");
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
         if(Objects.equals(lineLength_1, lineLength_2))
            System.out.println("the lengths are equal");
        else
            System.out.println("the lengths are not equal");
        int compareLength = (compare(lineLength_1, lineLength_2));
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
    public static void main(String[] args) {
        LineComparison equal = new LineComparison(20,25,30,35,30,45,55,70);
        equal.equalityComparison();
    }
}