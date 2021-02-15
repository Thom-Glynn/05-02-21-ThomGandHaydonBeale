package com.qa.day4;

public class Calculator {
	
	public void calculate(int a, int b, int c) {
        if((a * b) == c) {
            System.out.println(a + "*" + b + " = " + c);
            System.out.println(c + "/" + a + " = " + b);
            System.out.println(c + "/" + b + " = " + a);
        }
        if((a * c) == b) {
            System.out.println(a + "*" + c + " = " + b);
            System.out.println(b + "/" + a + " = " + c);
            System.out.println(b + "/" + c + " = " + a);
        }if((b * c) == a) {
            System.out.println(b + "*" + c + " = " + a);
            System.out.println(a + "/" + b + " = " + c);
            System.out.println(a + "/" + c + " = " + b);
        }if((a + b) == c) {
            System.out.println(a + "+" + b + " = " + c);
            System.out.println(c + "-" + a + " = " + b);
            System.out.println(c + "-" + b + " = " + a);
        }
        if((a + c) == b) {
            System.out.println(a + "+" + c + " = " + b);
            System.out.println(b + "-" + a + " = " + c);
            System.out.println(b + "-" + c + " = " + a);
        }if((b + c) == a) {
            System.out.println(b + "+" + c + " = " + a);
            System.out.println(a + "-" + b + " = " + c);
            System.out.println(a + "-" + c + " = " + b);
        }
    }

}
