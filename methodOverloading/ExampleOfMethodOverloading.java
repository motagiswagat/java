package methodOverloading;

public class ExampleOfMethodOverloading {

	////************* Method overloading is an example of compile time polymorphism.*************, while compiling it self, the code will figure out which method to call.
	static int max(int a,int b) {
		System.out.println("returning from int max method");
		return a>b?a:b;
		
	}
	static float max(float a,float b) {
		System.out.println("returning from float max method");
		return a>b?a:b; 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(max(5,6));//1st method is used which has float data type
		System.out.println(max(5.0f,6.5f));//2nd method is used which has float data type
	}
}
