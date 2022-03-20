package classInJava;


class REKTANGLE{//created new class
	////*******These are properties which are set as private
	private double length;
	private double breadth;
	//*********till here
	
		
	///*******These are methods
	public double area() {
		return getLength()*getBreadth();
	}
	public double perimeter() {
		return 2*(getLength()+getBreadth());
	}
	////*******till here
	
	///These are getters and setters
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getBreadth() {
		return breadth;
	}
	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
}
public class HidePropertiesAKAdataUsingGettersANDsetters {

	public static void main(String[] args) {
		
		REKTANGLE RectObj=new REKTANGLE();///********Created object of the class
		RectObj.setLength(20);
		RectObj.setBreadth(15);
		System.out.println(RectObj.area());
		System.out.println(RectObj.perimeter());
	}

}
