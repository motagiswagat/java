package OOPS;
class Parent
{
	protected int var1;
	protected int var2;
	
	Parent(int a,int b){//parent class constructor
		this.var1=a;
		this.var2=b;
	}
    public void add()
    {
        System.out.println(var1+var2);
    }
    
}

class Child extends Parent
{
    Child(int a, int b) {
		super(a, b);
		// the child class constructor is referencing to parent class
	}
    public void mult() {
    	System.out.println(super.var1*super.var2);
    }
}
public class Inheritance {
	public static void main(String[] args) 
    {
        Child s=new Child(55,98);
        s.add();//this method is called from parent class
        s.mult();//the method is from child class1
}
}