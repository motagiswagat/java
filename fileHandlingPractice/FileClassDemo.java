package fileHandlingPractice;

import java.io.File;

public class FileClassDemo {
	//this class is used to handle files in java
	public static void main(String[] args) {
		File f=new File("C:/Users/Swagat/Downloads");
		String filenames[]=f.list();//array of file names in string.
		for(String s:filenames)
			System.out.println(s);
	
	}

}
