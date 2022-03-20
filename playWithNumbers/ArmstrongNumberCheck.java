package playWithNumbers;

import java.util.Scanner;

public class ArmstrongNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number to check");
		int a=s.nextInt();
		int stored_a=a;
		int sumOfCubes=0;
		//if sum of cubes of digits of number==number, then its an armstrong number.
		while(a>0) {
			int last_digit=a%10;
			sumOfCubes+=(last_digit*last_digit*last_digit);
			//System.out.println(last_digit);
			a=a/10;
		}
		if(sumOfCubes==stored_a) {
			System.out.println("Number "+stored_a+" is armstrong number");
		}
		else {
			System.out.println("Number "+stored_a+" is NOT an armstrong number");
		}
		
	}

}
