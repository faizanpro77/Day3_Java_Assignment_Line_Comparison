package com.bridgelabz;

public class LineComparison {
    public static void main(String[] args) {

        System.out.println("Welcome to Line Comparison Computation Program");
        int x_1 = 20, x_2 = 25, y_1 = 30, y_2 = 35;
        int v_x,v_y;
        v_x = x_2 - x_1;
        v_y = y_2 - y_1;
        double a = Math.pow(v_x,2);
        double b = Math.pow(v_y,2);
        double linelength = Math.sqrt(a+b);
        System.out.println("length of a line is : "+linelength);
    }
}
