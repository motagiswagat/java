package playWithStrings;

import java.util.Dictionary;
import java.util.Hashtable;

public class CountStringOccurencesUsingDictionary {

	public static void main(String[] args) {
		Dictionary<Character,Integer> d=new Hashtable<Character,Integer>();     //Define Dictionary in java using Hashtable's Object
		String str="oneString";
		char[] strArray=str.toCharArray();
		int i=0;
		for(char a:strArray) {
			d.put(a,i);
			i++;
		}
		System.out.println(d);//print dictionary
		
	}

}
