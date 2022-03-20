package OOPS;
class mainclass
{
	protected int var1;
	protected int var2;
	
	mainclass(int a,int b){//parent class constructor
		this.var1=a;
		this.var2=b;
	}
    public void add()
    {
        System.out.println(var1+var2);
    }
}

class subclass extends mainclass
{
	private int var3;//created another variable in subclass
	subclass(int a, int b,int c) {
		super(a, b);//the child class constructor is referencing to parent class using SUPER keyword*****IMPORTANT********
		this.var3=c;//this variable is only applicable to child class
		// 
	}
    public void mult() {
    	System.out.println(super.var1*super.var2);
    	//System.out.println(var1*var2);//both ways are fine
    }
    public void multiplicationOfAllNum() {
    	System.out.println(var1*var2*var3);
    }
}
public class Inheritance2 {
	public static void main(String[] args) 
    {
		subclass s=new subclass(55,98,58);//the 1st 2 variable are sent to parent class constructor, and 3rd to child class constructor*****IMPORTANT********
        s.add();//this method is called from main class
        s.mult();//the method is from subclass
        s.multiplicationOfAllNum();
}
}