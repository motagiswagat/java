package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class ReadObjectFromFile {

	public static void main(String[] args) throws Exception{
	FileInputStream file=new FileInputStream("C:/Users/Swagat/Downloads/javaobject.txt");
	ObjectInputStream ois=new ObjectInputStream(file);
	
	Student studentobject;// initialize object of student class.
	studentobject=(Student) ois.readObject(); //typecast as the object of student class
	System.out.println(studentobject.age); 
	
	
	
	ois.close();
	file.close();
			
	}

}
