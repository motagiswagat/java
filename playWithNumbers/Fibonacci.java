package playWithNumbers;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number of terms for fibonacci series");
		Scanner s=new Scanner(System.in);
		int a=0,b=1,c=0;
		int n=s.nextInt();
		System.out.print(a+","+b+",");
		for(int i=0;i<n-2;i++) {
			c=a+b;
			if(i==(n-3)) {
				System.out.print(c);
			}
			else{
				System.out.print(c+",");
			}
			a=b;
			b=c;
		}
	}

}
