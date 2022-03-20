package OOPS;
class Super
{
    public void display()
    {
        System.out.println("Super Display");
    }
}
////************* Method overloading is an example of compile time polymorphism.*************, while running the code it will figure out which method to call,and
//not during compiling

class Sub extends Super
{
	@Override			//you can mention this,not mandatory to mention.
    public void display()//the method is getting overrided via super class method, hence this will be called
    {
        System.out.println("Sub Display");
    }
}
public class MethodOverriding {
	public static void main(String[] args) 
    {
        Super s=new Sub();
        s.display();
}
}