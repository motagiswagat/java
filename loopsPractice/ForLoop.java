package loopsPractice;

public class ForLoop {
	public static void main(String args[]) throws InterruptedException {
		
		
		
		for(int i=0;i<100;i++) {
			System.out.println(i);
			
	
		}
		
		int i=0;
		for(;;) {//all the 3 conditions/parameters inside for loop are optional---Initialization, condition, updation
			System.out.println(i);
			i++;
			Thread.sleep(1000);
		}
		
		
	}
	
	
}
