package harmonic_num;

import java.util.Scanner;

public class Harmonicnum {

	float harmonicNumber(int num){
		float harmonicFormula=0;
		for(float i=2;i<num;i++) {
			harmonicFormula=(1/i)+harmonicFormula;
		}
		return harmonicFormula;
}
	public static void main(String[] args) {
		Harmonicnum rv=new Harmonicnum();
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter A Number Whose Harmonic Value u need");
		int num=inp.nextInt();
		if (num>0)
		System.out.println("Harmonic value is "+rv.harmonicNumber(num));
		inp.close();
	}
}