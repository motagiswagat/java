package methodPractice;

public class IgnoreThisFIle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d=20.50;
		String s1="ABCRA##$$J289##$$ga";
		String[] arr=s1.split("##$$",-2);
		System.out.println(arr[0]);
		for(String s:arr) {
			System.out.println(s);
		}
		String s2=String.valueOf(d);
		String s=Double.toString(d);
		//System.out.println(s+s2);
	}

}
