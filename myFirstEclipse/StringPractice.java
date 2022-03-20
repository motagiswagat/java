package myFirstEclipse;

public class StringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Swagat";//this will be added to a pool
		String s2="Swagat";
		String s1=new String("Swagat"); //This is constructor--the object created by this will be added to heap
		System.out.println("String using constructor "+s1);
	
		//String using characters
		char c[]= {'A','B'};
		String charstring=new String(c);
		System.out.println("String using characters " +charstring);
		
		//String using byte
		byte b[]= {65,66,67,68};
		String bytestring=new String(b);
		System.out.println("String using bytes "+bytestring);
		
		
		///Check whether the references of variable are equal or not
		System.out.println(s1==s);
		System.out.println(s==s2);
	}

}
