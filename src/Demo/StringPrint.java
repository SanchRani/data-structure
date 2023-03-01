package Demo;

public class StringPrint {

	public static void main(String[] args) {
		String s="SANCH RANI";
		String result=reversedString1(s);
		System.out.println(result);
		

	}

	private static String reversedString(String s) {
		String temp ="";
		
		int j=s.length()-1;
		while(j>=0) {
			
			temp=temp+ s.charAt(j);
			j--;
		}
		return temp;
	}
	

	private static String reversedString1(String s) {
		
		String result;
		// ['S','A','N','C','H']
		char[] arr = s.toCharArray();
		
		int i =0;
		int j= arr.length -1;
		
		while(i<j) {
			swap(arr,i,j);
			i++;
			j--;
		}
		result = new String(arr);
		return result;
	}

	private static void swap(char[] arr, int i, int j) {

		char temp = arr[i];
		arr[i]=arr[j];
		arr[j] =temp;
		
	}
	

}
