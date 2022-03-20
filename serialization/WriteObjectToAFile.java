package serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{ //this class must implement "Serializable" interface.
	public int age;
	public String name;
	public String dept;
}
public class WriteObjectToAFile {

	public static void main(String[] args) throws Exception{
	FileOutputStream file=new FileOutputStream("C:/Users/Swagat/Downloads/javaobject.txt");
	ObjectOutputStream oos=new ObjectOutputStream(file);
	
	Student studentobject=new Student();//created object of student class which is to be stored in file
	studentobject.age=15;
	studentobject.name="Akash";
	studentobject.dept="CSE";
	
	
	oos.writeObject(studentobject);
	oos.close();
	file.close();
			
	}

}
