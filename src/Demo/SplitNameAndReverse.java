package Demo;

public class SplitNameAndReverse {

	public static void main(String[] args) {
		String name = "Sanch Rani";
		String[] reversedName = reverseName(name);
		for (String a : reversedName) {
			System.out.println(a);
		}
		
	}

	private static String[] reverseName(String name) {
		
		String[] x = name.split(" ");
		String[] result = new String[x.length];
		
		int i =0;
		for (String a : x) {
             String reversedString = reverse(a);
			 result[i]=reversedString;
			 i++;
			
		}
		return result;
        

	}

	private static String reverse(String s) {
		
       String temp ="";
		
		int j=s.length()-1;
		while(j>=0) {
			
			temp=temp+ s.charAt(j);
			j--;
		}
		return temp;
		
	}

}
