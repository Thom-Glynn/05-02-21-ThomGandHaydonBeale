package com.qa.day4;

public class Doggo {
	public void DogPlace(int p) {
		//
		for (int a = 0; a < 10; a++) {
			for (int b = 0; b < 10; b++) {
				if (a == 0 && b == 0) {
					b++;
				}
				// System.out.println((a * 10 + b) + "");
				if (p == (a * 10 + b)) {
				} else {
					if (b == 1 && a != 1) {
						System.out.println((a * 10 + b) + "st");
					} else if (b == 2 && a != 1) {
						System.out.println((a * 10 + b) + "nd");
					} else if (b == 3 && a != 1) {
						System.out.println((a * 10 + b) + "rd");
					} else {
						System.out.println((a * 10 + b) + "th");
					}
				}
			}
		}
		if (p != 100) {
			System.out.println("100th");
		}
	}

}
