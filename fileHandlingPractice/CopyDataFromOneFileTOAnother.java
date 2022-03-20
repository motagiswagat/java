package fileHandlingPractice;

import java.io.*;

public class CopyDataFromOneFileTOAnother {

	public static void main(String[] args) throws Exception {
		//read from file.
		FileInputStream f=new FileInputStream("C:/Users/Swagat/Downloads/Nifty 50.txt");
		byte[] b=new byte[f.available()];
		f.read(b);
		String s=new String(b);
		//System.out.println(s);
		f.close();
		
		//write to file
		FileOutputStream fos=new FileOutputStream("C:/Users/Swagat/Downloads/Nifty 50_copy.txt");
		fos.write(s.getBytes());
		fos.close();
	}

}
