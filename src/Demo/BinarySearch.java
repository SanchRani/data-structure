package Demo;

public class BinarySearch {

	public static void main(String[] args) {
	int[] array= {1,2,3,4,5,16,17,18,19,100};
	int elementIndex = searchElement(array, 19);
	System.out.println(elementIndex);

	}
	public static int searchElement(int[] array,int k) {
		int start = 0;
		int end = array.length-1;
		
		while (end>start) {
			int mid;
			mid = (start+end)/2;
			if(array[mid]==k) {
				return mid;
			}
			if(mid>k) {
				
				end=mid;
			}
			else start=mid;
			
		}
		
		
		
		
		return -1;
	}
	

}
