package exceptionDemo;

public class ExceptionDemo1 {

	public static void main(String[] args) {
	int a=5,b=0;
	
	try {
	
	System.out.println(a/b);
	}
	catch (ArithmeticException e) { // this is specific exception type as, Arithmetic Exception.
		System.out.println("zero in denominotor"+e);
	}
	catch(Exception e) {		//you can simply mention Exception as generic way. FOr all other exceptions, the code will come to this block
		
		System.out.println("You made a mistake"+e);
	}
	
	}

}
