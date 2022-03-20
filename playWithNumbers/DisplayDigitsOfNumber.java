package playWithNumbers;

import java.util.Scanner;

public class DisplayDigitsOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number to get its digits");
		int a=s.nextInt();
		//System.out.println(a%10);
		while(a>0) {
			int last_digit=a%10;
			System.out.println(last_digit);
			a=a/10;
			//System.out.println("a is"+a);
		}
	}

}
