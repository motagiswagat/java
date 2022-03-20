package wrapperclass;

public class WrapperClassExample1 {

	public static void main(String[] args) {
		int u=5;// this is a primitive data type, it is not a object.
		
		Double d=Double.valueOf(u);// to convert it into a object we use wrapper class. So now we can convert int to Double
		System.out.println(d);
		
		
		
		///Example 2
		char ah='A';
		Character b=Character.valueOf(ah);
		Character b2=ah; //valueOf is deprecated, you can simply say Character b=ah;
		System.out.println(b);//the object b has methods to access now, which earlier weren't.
		System.out.println(b2);

		
		//************ Wrapper classes are used to convert primitives to objects using Auto-boxing and vice versa using unboxing.
	}

}
