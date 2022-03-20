package exceptionDemo;

public class ExceptionDemo2 {

	public static void main(String[] args) {
	
	int arr[]= {1,2,3,4};
	
	try {
		System.out.println(arr[5]);
	}
	catch (ArithmeticException e) { // this is specific exception type as, Arithmetic Exception.
		System.out.println("zero in denominotor"+e);
	}
	catch(Exception e) {		//you can simply mention Exception as generic way. FOr all other exceptions, the code will come to this block
		
		System.out.println("You made a mistake :("+e.getMessage());
	}
	
	}

}
