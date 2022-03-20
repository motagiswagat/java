import java.lang.*;
import java.util.*;

public class ReadKeyboardWithException
{

	public static void main(String args[]){

		Scanner s=new Scanner(System.in);
		int x,y;
		System.out.println("Enter 2 numbers");
		try{
			x=s.nextInt();
			y=s.nextInt();
			int z=x+y;
			System.out.println(z);
		}
		catch (Exception e){
			System.out.println("Error message is shown"+e);
		}
		
		


}
}