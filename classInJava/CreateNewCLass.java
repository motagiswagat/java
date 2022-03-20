package classInJava;


class Rectangle{//created new class
	////*******These are properties
	public double length;
	public double breadth;
	//*********till here
	
		
	///*******These are methods
	public double area() {
		return length*breadth;
	}
	public double perimeter() {
		return 2*(length+breadth);
	}
	////*******till here
}
public class CreateNewCLass {

	public static void main(String[] args) {
		
		Rectangle RectObj=new Rectangle();///********Created object of the class
		RectObj.length=20;
		RectObj.breadth=15;
		System.out.println(RectObj.area());
		System.out.println(RectObj.perimeter());
	}

}
