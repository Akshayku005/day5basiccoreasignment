package addingnum;

import java.util.Scanner;

public class AddTwoNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, sum;
		Scanner scan = new Scanner(System.in);
System.out.println("enter the number");
a= scan.nextInt();
System.out.println("enter the number");
b= scan.nextInt();
sum=a+b;
System.out.println("Sum is :"+sum);
scan.close();
	}

}
