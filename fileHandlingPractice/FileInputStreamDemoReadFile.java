package fileHandlingPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamDemoReadFile {

	public static void main(String[] args) throws IOException {
		//create a new file
		
		try {
		FileInputStream fis=new FileInputStream("C:/Users/Swagat/Documents/java codes/javatxtfile.txt");
		byte[] bytearray=new byte[fis.available()];	//create a bytearray of size which is file size.
		fis.read(bytearray); //from fis the data comes into bytearray.
		String readstring=new String(bytearray);	//convert bytearray into string
		System.out.println(readstring);
		
		
		}
		catch( FileNotFoundException e){
			System.out.println(e);
		}
		catch( IOException e){
			System.out.println(e);
		}

	}

}
