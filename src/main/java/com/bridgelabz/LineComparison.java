package com.bridgelabz;

import java.util.Objects;

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
        double linelength_1 = Math.sqrt(a+b);
        double linelength_2 = Math.sqrt(c+d);
        System.out.println("length of a first line is : "+linelength_1);
        System.out.println("length of a second line is : "+linelength_2);

        if(Objects.equals(linelength_1, linelength_2))
            System.out.println("the lengths are equal");
        else
            System.out.println("the lengths are not equal");
    }
}
