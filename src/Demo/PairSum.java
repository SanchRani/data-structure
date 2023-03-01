package Demo;

public class PairSum {

	public static void main(String[] args) {
		int[] array= {1,2,3,4,5,6,7,8};
		int[] pair= indexOfPair(array,5);
		System.out.println(pair[0]+","+pair[1]);
		}

	public static int[] indexOfPair(int[] array, int sum) {
		
		int[] result = new int[2];
		int sumOfNumbers;
		int end=array.length-1;
		for(int i=0;i<end;i++) {
			
			
			for(int j=i+1;j<end;j++) {
				sumOfNumbers=array[i]+array[j];
				if(sumOfNumbers==sum) {
					result[0]=i;
					result[1]=j;
				
					return result;
				}
			}
			
	    }
		result[0]=-1;
		result[1]=-1;
		return result;

	}
			
		

	}


