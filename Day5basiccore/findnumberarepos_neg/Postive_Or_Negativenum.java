package findnumberarepos_neg;

import java.util.Scanner;

public class Postive_Or_Negativenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan= new Scanner(System.in);
System.out.println("Enter a value to check its positive or negative");
int x= scan.nextInt();
if(x>=0) {
	System.out.println("The entered value is positive");
}else {
	System.out.println("The entered value is negative");
}
scan.close();
}

}
