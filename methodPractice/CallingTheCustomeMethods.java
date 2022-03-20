package methodPractice;

public class CallingTheCustomeMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=4,d=5;
		c=max(c,d);
		System.out.println("Max is "+c);
		
	}
	static int max(int a, int b) {//only static method can be called from main methods directly
		if(a>b) {
			return a;
		}
		else {
			return b;
		}
	}

}
