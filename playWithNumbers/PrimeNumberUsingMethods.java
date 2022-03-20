package playWithNumbers;

public class PrimeNumberUsingMethods {

	static boolean  isPrime(int a) {
		if(a<=1) {
			return false;
		}
		for(int i=2;i<=(a/2);i++) {
			if (a%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<100000;i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
	}
	

}
