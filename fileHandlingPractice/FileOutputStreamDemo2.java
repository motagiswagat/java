package fileHandlingPractice;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo2 {

	public static void main(String[] args) throws IOException {
		//create a new file
		
		try {
		FileOutputStream fos=new FileOutputStream("C:/Users/Swagat/Documents/java codes/javatxtfile2.txt");
		String s="data to write in file. THis is line one";
		byte[] bytearray=s.getBytes();
		for(byte b:bytearray)	//writing one byte at at time.
			fos.write(b);
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
