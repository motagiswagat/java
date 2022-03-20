package playWithNumbers;

import java.util.Scanner;

public class SumOfNnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		//sum using formula
		System.out.println( a*(a+1)/2);
		//sum using for loop
		int sum_var = 0;
		for(int i=0;i<=a;i++) {
			sum_var+=i;
		}
		System.out.println(sum_var);
		System.out.println(sum_var==a*(a+1)/2);
	}
	

}
