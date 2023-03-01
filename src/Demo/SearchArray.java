package Demo;

public class SearchArray {

	public static void main(String[] args) {
		int[] array = { 2, 56, 7, 9, 0 };

		boolean result = isNumberPresent(array, 19);
		//System.out.println(result);
		
		
		int result1 =numberSum(array);
		//System.out.println("Total Sum of Array is "+result1);
		
		int number= indexOfElement(array, 9);
		System.out.println(number);

	}

	static boolean isNumberPresent(int[] array, int a) {

		for (int i = 0; i < array.length; i++) {

			int currentValue = array[i];
			if (currentValue == a) {
				return true;
			}

		}

		return false;
	}
	static int numberSum(int[] array) {
		int sum=0;
		for(int num : array) {
			sum = sum+ num;
		}
		
		return sum;
	}
	
	static int indexOfElement(int[] arraynum,int a) {
		for(int i= 0; i< arraynum.length;i++) {
			
			int currentValue = arraynum[i];
			if (currentValue == a) {	
				return i;
			}
		}
		
		
		return -1;
	}

}
