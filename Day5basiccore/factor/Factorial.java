package factor;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, f=1, i;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		n= scan.nextInt();
		for (i=1; i<=n; i++) {
			f=f*i;
		}
		System.out.println("factorial is :"+f);
		scan.close();
			}
	}
