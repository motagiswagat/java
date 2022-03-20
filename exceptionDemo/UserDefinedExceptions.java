package exceptionDemo;

class UserDefinedException extends Exception{
	public String toString() {
		return "this is user defined exception\n the message is (Number is negative)";
	}
}
public class UserDefinedExceptions {

	public static void main(String[] args)  {
	
	int arr[]= {-1,2,3,4};
	
	try {

		//System.out.println(arr[5]);
		for(int a:arr) {
			if (a<0){throw new UserDefinedException();};
		}
		
	}
	catch (UserDefinedException e) { // this is specific exception type as, Arithmetic Exception.
		System.out.println("Called the user defined exception "+e);
	}
	catch(Exception e) {		//you can simply mention Exception as generic way. FOr all other exceptions, the code will come to this block
		
		System.out.println("(Falls under all other exceptions) You made a mistake :("+e.getMessage());
	}
	
	}

}
