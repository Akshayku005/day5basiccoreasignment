package q_r;

import java.util.Scanner;

public class QandR {
public static void main(String[] args) {
	int a, b, q, rem;
	Scanner scan= new Scanner(System.in);
	System.out.println("enter the divisor number");
	a=scan.nextInt();
	System.out.println("enter the divisor number");
	b=scan.nextInt();
	q=a/b;
	rem=a%b;
	System.out.println("The quotient is "+q);
	System.out.println("The reminder is "+rem);
	scan.close();
}

}



