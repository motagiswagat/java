package exceptionDemo;

class UserDefinedException extends Exception{ //***Declare used defined exception class which must inherit from EXCEPTION CLASS
	public String toString() { //Override toString method of Exception class
		return "this is user defined exception\n the message is (Number is negative)";
	}
}
public class UserDefinedExceptions2 {
	public static int counter=0; //counter will be incremented based on who calls it first.
	public static void exampleExceptionmethod() throws UserDefinedException {
		counter++;
		int arr[]= {-1,2,3,4};
		
			for(int a:arr) {
				if (a<0){throw new UserDefinedException();};
			}
					
	}
	public static void main(String[] args)   { //Throws isn't mentioned here because try catch is implemented.
		counter++;
		System.out.println(counter+"main method was called");
		try {
		exceptionImplementation();
		}
		catch(UserDefinedException e) {
			System.out.println(counter+" "+e);
			System.out.println(counter+"Try catch implemented in main  method, printed the error from main block");
		}
		finally {
			System.out.println(counter+"Add your final statements here");
		}
		
	
	}
	public static void exceptionImplementation() throws UserDefinedException { //Throws is mentioned here because try catch is NOT implemented.
		counter++;
		System.out.println(counter+"exceptionImplementation method was called");
		exampleExceptionmethod();
	}
}
