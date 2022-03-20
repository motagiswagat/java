package OOPS;
class TV
{
    public void display()
    {
        System.out.println("TV is turned on");
    }
}

class SmartTV extends TV
{
	@Override//you can mention this,not mandatory to mention.
    public void display()//the method is getting override via super class method, hence this will be called
    {
        System.out.println("Smart TV is turned on");
    }
	public void browse() {
		System.out.println("this method cant be printed if you use parent class as reference");
	}
}
public class DynamicMethodDispatch {
	public static void main(String[] args) 
    {
        TV s=new SmartTV();//*****IMPORTANT********left side is REFERENCE, right side is OBJECT, hence right side class is called	*****IMPORTANT********
        s.display();
        //the methods which are in ""SmartTV"" class but not in ""TV"" class, can't be called
        //s.browse(); //this isn't allowed											*****IMPORTANT********
}	
}