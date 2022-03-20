package playWithStrings;

public class StringBufferDemo {

	public static void main(String[] args) {
		///****** Example 1
		StringBuffer s=new StringBuffer("Straight");
		System.out.println("Before "+s);
		s.reverse(); //its an inplace reverse
		System.out.println("After "+s);
		
		
		
		///****** Example 2
		StringBuffer s2=new StringBuffer("onestring");
		System.out.println("Before appending "+s2);
		s2.append("acf");
		System.out.println("After appending "+s2);
	}

}
