package myFirstEclipse;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=" Java";
		System.out.println(s1.length());
		String s1_in_lower=s1.toLowerCase();
		System.out.println(s1_in_lower);
		s1=s1.toUpperCase();//when you change existing string, a new object will be created and assigned to existing string.
		System.out.println(s1);
		
	}

}
