package playWithNumbers;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;

public class NumberToText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dictionary<Integer, String> number_text= new Hashtable();
		number_text.put(0, "Zero");
		number_text.put(1, "One");
		number_text.put(2, "Two");
		number_text.put(3, "Three");
		number_text.put(4, "Four");
		number_text.put(5, "Five");
		number_text.put(6, "Six");
		number_text.put(7, "Seven");
		number_text.put(8, "Eight");
		number_text.put(9, "Nine");
		System.out.println("Enter a number in integer to get in text");
		Scanner s=new Scanner(System.in);
		int get_number=s.nextInt();
		String number_in_text="";
		while(get_number>0) {
			int last_digit=get_number%10;
			number_in_text=number_text.get(last_digit)+" "+number_in_text;
			get_number=get_number/10;
			
		}
		System.out.println(number_in_text);
		
		
		
	}

}
