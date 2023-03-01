package Demo;

public class EvenOdd {

	public static void main(String[] args) {
	   
		EvenOdd e=new EvenOdd() ;
		boolean result= e.isEven(78);
		
		System.out.println(result);
		boolean result2= isOdd(11);
		System.out.println("Odd Result is "+result2);
		
	

	}
	boolean isEven(int a) {
		if(a%2 ==0) {
		   return true;
		}
		else return false;
		
	}
	static boolean isOdd(int b) {
		if(b%2 !=0) {
			return true;
		}
		else return false;
	}
	

}
