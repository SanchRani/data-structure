package Demo;

public class ReversingNumber {

	public static void main(String[] args) {
		int result= reverseNumber(1987);
		System.out.println(result);

	}

	private static int reverseNumber(int i) {
		int result=0;
		while(i!=0) {
			int remainder=i%10;
		    result=result*10+remainder;
			i=i/10;
			
			
		}
		return result;
	}

}
