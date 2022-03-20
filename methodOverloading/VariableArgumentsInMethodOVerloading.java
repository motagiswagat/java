package methodOverloading;

public class VariableArgumentsInMethodOVerloading {
	static void justPrint(int ...A) {//this method takes variable arguments.. like 0 integers to many integers
		for (int x:A) {
			System.out.println("printing from JustPrint method"+x);
		}
		System.out.println("\n");
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		justPrint(5,6);
		justPrint(5);
		justPrint();//this prints nothing
		justPrint(new int[] {1,2,3,4,5});//it takes as many elements from an array and sends to method
		//by the way the above array is created in heap, its anonymous array.
	}

}
