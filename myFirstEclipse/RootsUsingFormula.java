package myFirstEclipse;

import java.util.Scanner;

public class RootsUsingFormula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		double r1,r2;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		double inner=Math.sqrt(b*b-4*a*c );
		r1=(-b+inner)/2*a;
		r2=(-b-inner)/2*a;
		System.out.println(r1);
		System.out.println(r2);
		
	}

}
