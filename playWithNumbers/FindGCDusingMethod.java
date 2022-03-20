package playWithNumbers;

public class FindGCDusingMethod {
	static int findGCD(int m,int n) {
		while(m!=n) {
			if(m>n) {
				m=m-n;
			}
			else {
				n=n-m;
			}
		}
		return m;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=35,n=56;
		System.out.printf("GCD of given numbers %d ,%d is %d",m,n,findGCD(m,n));
	}

}
