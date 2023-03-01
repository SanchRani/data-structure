package Demo;

public class PairSumDifferentMethod {

	public static void main(String[] args) {
		int[] array = { 1, 4, 7, 8, 12, 14, 15 };

		int[] result = pairOfSum(array, 29);
		System.out.println(result[0] + "," + result[1]);

	}

	private static int[] pairOfSum(int[] array, int k) {
		int start = 0;
		int end = array.length - 1;
		int sum;
		int[] result1 = new int[2];
		while (start < end) {
			sum = array[start] + array[end];
			if (sum == k) {
				result1[0] = start;
				result1[1] = end;
				return result1;
			} else if (sum < k) {
				start = start + 1;

			} else {
				end = end - 1;

			}
		}

		result1[0] = -1;
		result1[1] = -1;
		return result1;
	}

}
