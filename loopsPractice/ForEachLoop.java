package loopsPractice;

public class ForEachLoop {

	public static void main(String[] args) {
		// for each loop is used to iterate over array without mentioning their length.
		int arr[]= {1,2,3,4,5};
		for(int x:arr) {
			System.out.println(x);
		}
		
		//below is conventional way to access array elements using for loop
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
