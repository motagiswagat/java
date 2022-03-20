package interfaceExample;

class Phone 
{
    public void call() { System.out.println("Phone call"); }
    public void sms() { System.out.println("Phone sending SMS"); }
}

interface ICamera
{
    void click();//******* Interface has all methods as "ABSTRACT" and public by default*******
    void record();
}

interface IMusicPlayer
{
    void play();//******* Interface has all methods as "ABSTRACT"	*******
    void stop();
}

class SmartPhone extends Phone implements ICamera,IMusicPlayer		//**** Class is extended while interface is implemented.
{
    public void videoCall() { System.out.println("Smart Phone video calling"); }
   
    public void click() { System.out.println("Smart Phone Clicking Photo"); }//****** Methods from interface must be overrided.
    public void record() { System.out.println("Smart Phone recording video"); }	//****** Methods from interface must be overrided.
    public void play() { System.out.println("Smart Phone playing music"); }//****** Methods from interface must be overrided.
    public void stop() { System.out.println("Smart Phone stopped playing music"); }//****** Methods from interface must be overrided.

}
public class InterfaceExample 
{

    public static void main(String[] args) 
    {
        IMusicPlayer sp=new SmartPhone();	//Interface is the reference.(on left), hence methods from interface IMusicPlayer only can be accessed.
        sp.play();
        sp.stop();
        
    }
    
}