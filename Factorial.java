package com.qa.day4;

public class Factorial {
	
	public void ReverseFactorial(int i) {
		int input = i;
		int remainder = 0;
		int iteration = 1;
		do {
		   remainder = i%iteration;
		   i = i / iteration;
		   iteration ++;
		} while(i > 1 && remainder == 0);
		if (remainder != 0) {
			System.out.println(input + " = NONE");
		}else {
			System.out.println(input + " = " + (iteration - 1) + "!");
		}
	}

}
