package com.qa.main;

public class Runner {
	
	public static void flowChart(double num1) {
		if (num1 > 2000) {
			System.out.println("A");
			if (num1 > 6000) {
				System.out.println("C");
			}
			else {
				System.out.println("B");
				if (num1 > 4000) {
					System.out.println("D");
				}
				else {
				    System.out.println("E");
				}
			}
		}
		else {
			System.out.println("1");
			if (num1 > 100) {
				System.out.println("3");
				if (num1 > 600) {
					System.out.println("5");
				}
				else {
					System.out.println("4");
					if (num1 > 500) {
						System.out.println("6");
						
					}
					else {
						System.out.println("6");
					}
				}
			}
			else {
				System.out.println("2");
			}
		}
	}
	public static void main(String[] args) {
		flowChart(2500);
		flowChart(6000);
		flowChart(5);
	}
}
