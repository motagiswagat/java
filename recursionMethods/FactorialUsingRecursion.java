package recursionMethods;

public class FactorialUsingRecursion {
	static double factorial(double n) {
		if (n<=1) 
				return 1;
		return (n)*factorial(n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Factorial of given number using ReCuRsIoN  is "+factorial(5));
	}

}
