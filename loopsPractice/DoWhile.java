package loopsPractice;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1,n=100;
		do {
			System.out.println(i);
			i=i*2;
		}while(i<n);
		
		//another loop
		byte a=1;
		while(true) {
			System.out.println(a);
			a+=10;
		}
	}

}
