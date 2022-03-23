package calcualtion;

import java.util.Scanner;

public class calci {
	public static void addition(int num1, int num2) {
		System.out.println(num1+num2);
	}
	public static void substraction(int num1, int num2) {
		System.out.println(num1-num2);
		
	}
	public static void multiplication(int num1, int num2) {
		System.out.println(num1*num2);
		
	}
	public static void division(float num1f, float num2f) {
		System.out.println(num1f/num2f);
		
	}
	public static void main(String[] args) {
		System.out.println("Enter the number to calculate: ");
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter the first number");
			int num1= scan.nextInt();
			System.out.println("Enter the second number");
			int num2= scan.nextInt();
			addition(num1, num2);
			substraction(num1, num2);
			multiplication(num1, num2);
			division(num1, num2);
			
		}
	}
	}


