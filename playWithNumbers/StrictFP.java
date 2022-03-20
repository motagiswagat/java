package playWithNumbers;

strictfp class  strictfpclass{//strictfp class has all the methods returning same value across different environments
	public float var1;
	public float var2;
	strictfpclass(float a,float b){
		this.var1=a;
		this.var2=b;
	}
	
	public float returnfloatmult() {
		return var1*var2;
	}
	
}
public class StrictFP {
	static strictfp void flo() {
		System.out.println(10.0/3);//strictfp method returns same float value across different environments like mac, linux, windows
	}
	public static void main(String[] args) {
	
		flo();
	}

}
