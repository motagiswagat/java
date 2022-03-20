package OOPS;

abstract class baap
{
    public baap() { System.out.println("Super Constructor"); }
    
    public void meth1()
    {
        System.out.println("Meth1 of Super");
    }
    
    abstract public void meth2();//if any method is abstract, then class also becomes abstract. Abstract method has no body.
}

class beta extends baap
{
    @Override
    public void meth2()//the abstract methods from parent class must be overrided.
    {
        System.out.println("Sub meth2");
    }
}
public class AbstractExample 
{
    public static void main(String[] args) 
    {
    	baap s=new beta();
        s.meth1();
        s.meth2();
    }    
}