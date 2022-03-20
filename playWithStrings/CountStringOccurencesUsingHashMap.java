package playWithStrings;
import java.util.HashMap;
import java.util.Map;

public class CountStringOccurencesUsingHashMap {
	public void hm(String s){
		//StringBuffer s=new StringBuffer("abcd");
		HashMap<Character, Integer> h=new HashMap<Character, Integer>();
		char[] stringarray=s.toCharArray();
		for(char a:stringarray) {
			if(h.containsKey(a)) {
				h.put(a, h.get(a)+1);
			}
			else {
				h.put(a, 1);
				
			}
		}
		for(Map.Entry entry:h.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
	public static void main(String[] args) {
		
		CountStringOccurencesUsingHashMap s=new CountStringOccurencesUsingHashMap();
		s.hm("abracadabra");

	}

}
