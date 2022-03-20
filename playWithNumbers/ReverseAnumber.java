package playWithNumbers;

import java.util.Scanner;

public class ReverseAnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number to reverse");
		int a=s.nextInt();
		//System.out.println(a%10);
		int rev=0;
		while(a>0) {
			int last_digit=a%10;
			rev=rev*10+last_digit;
			a=a/10;
			//System.out.println("a is"+a);
		}
		System.out.println("reversed number is "+rev);
	}

}
