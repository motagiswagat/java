package geneticConcepts;


// Create a class
class parent{
	public int a;
	public int b;
	parent(int a,int b){
		this.a=a;
		this.b=b;
	}
	public int mult() {
		return a*b;
	}
	public String toString() {
		return "mult is "+mult();
	}
}
public class toStringConcept {

	public static void main(String[] args) {
		//create object of class
		parent a=new parent(5,559);
		System.out.println(a);			//********* Learning here is, when you print the object directly, it will call toString method.
		
	}

}
