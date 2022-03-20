package fileHandlingPractice;


import java.io.FileNotFoundException;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		//create a new file
		
		try {
		FileReader fr=new FileReader("C:/Users/Swagat/Documents/java codes/javatxtfile.txt");
		int x;
		while((x=fr.read())!=-1) {
			System.out.print((char) x);//converted to character.
		}
		
		
		
		}
		catch( FileNotFoundException e){
			System.out.println(e);
		}
		catch( IOException e){
			System.out.println(e);
		}

	}

}
