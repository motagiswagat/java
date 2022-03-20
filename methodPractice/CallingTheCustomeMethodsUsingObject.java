package methodPractice;

public class CallingTheCustomeMethodsUsingObject {
	
	
	int max(int a, int b) {//only static method can be called from main methods directly, to call non static method, create object of class
		if(a>b) {
			return a;
		}
		else {
			return b;
		}
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=4,d=5;
		//////**********create object of class********
		CallingTheCustomeMethodsUsingObject object=new CallingTheCustomeMethodsUsingObject();
		
		c=object.max(c,d);
		System.out.println("Max is "+c);
		
	}
	
}
