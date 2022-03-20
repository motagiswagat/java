package myFirstEclipse;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		float base=s.nextFloat();
		float height=s.nextFloat();
		float area=(float) (0.5*base*height);
		System.out.println(area);
	}

}
