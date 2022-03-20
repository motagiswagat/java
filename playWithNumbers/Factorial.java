package playWithNumbers;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int fact=1;
		while(a>1) {
			fact=fact*a;
			a-=1;
		}
		System.out.println(fact);
	}

}
