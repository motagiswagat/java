package OOPS;

abstract class shape{
	abstract double perimeter();		//this class has undefined features like perimeter and area.
	abstract double area();		
}

class circle extends shape{
	public double radius;
	circle(double radius){
		this.radius=radius;
	}
	public double perimeter() {		//perimeter method is overrided in child class
		System.out.println("circle perimeter is");
		return 2*Math.PI*radius;
	}
	public double area() {			//area method is overrided in child class
		System.out.println("circle area is");
		return Math.PI*radius*radius;
	}
}
class rectangle extends shape{
		public double length;
		public double breadth;
		rectangle(double l,double b){
			this.length=l;
			this.breadth=b;
		}
		public double perimeter() {//perimeter method is overrided in child class
			System.out.println("rect perimeter is");
			return 2*(length+breadth);
		}
		public double area() {//area method is overrided in child class
			System.out.println("rect area is");
			return length*breadth;
		}	
}
public class AbstractExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape s1=new circle(5);
		System.out.println(s1.area());
		System.out.println(s1.perimeter());
		
		shape s2=new rectangle(5,10);
		System.out.println(s2.area());
		System.out.println(s2.perimeter());
		
		//shape s3=new shape();		//*****************object cannot be created for abstract class. THIS ISNT ALLOWED.*****************
		shape s3;					//*****************however this is allowed, you can declare reference.*****************
		/// abstract method cant be 'final' or 'static', abstract classes cant be having 'Final' keyword.
	}

}
