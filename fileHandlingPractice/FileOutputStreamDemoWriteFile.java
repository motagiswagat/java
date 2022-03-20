package fileHandlingPractice;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemoWriteFile {

	public static void main(String[] args) throws IOException {
		//create a new file
		
		try {
		FileOutputStream fos=new FileOutputStream("C:/Users/Swagat/Documents/java codes/javatxtfile.txt");
		String s="data to write in file. THis is line one";
		fos.write(s.getBytes());//this is array of bytes.
		fos.close();
		}
		catch( FileNotFoundException e){
			System.out.println(e);
		}
		catch( IOException e){
			System.out.println(e);
		}

	}

}
