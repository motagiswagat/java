package classInJava;


class someRektangalClass{//created new class
	////*******These are properties
	public double length;
	public double breadth;
	//*********till here
	
	///******Constructors--which is like __init__ in Python
	public someRektangalClass() {//Constructor has same name as class, it has NO return type, not even VOID.
		length=8;
		breadth=10;
	}
	
	public someRektangalClass(int l,int b) {//This Constructor takes arguments. Its a parameterized constructor. Constructor is called automatically while creating obj.
		length=l;
		breadth=b;
	}
		
	///*******These are methods
	public double area() {
		return length*breadth;
	}
	public double perimeter() {
		return 2*(length+breadth);
	}
	////*******till here
}
public class ConstructorExample {

	public static void main(String[] args) {
		
		someRektangalClass RectObj=new someRektangalClass();///********Created object of the class
		//RectObj.length=20;
		//RectObj.breadth=15;
		System.out.println("This call is from the constructor which doesn't take any arguments "+RectObj.area());
		System.out.println("This call is from the constructor which doesn't take any arguments "+RectObj.perimeter());
		
		//lets create another object with parameters
		someRektangalClass anotherObject=new someRektangalClass(40,25);
		System.out.println("This call is from the constructor which takes arguments "+anotherObject.area());
		System.out.println("This call is from the constructor which takes arguments "+anotherObject.perimeter());
	}

}
