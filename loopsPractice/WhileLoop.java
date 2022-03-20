package loopsPractice;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		double a=s.nextDouble();
		while(a>1) {
			a=(a%10);
			a=a-1;
			
		}
		System.out.println(a);
		
	}

}
