package Demo;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter a number: ");  
		//reads a long number from the user  
		int number=sc.nextInt();
		
		int result=digitOfSum(number);
		
		System.out.println(result);

	}
	
	static int digitOfSum(int number) {
		
		
		int sum = 0;
		while(number != 0) {
			
			sum = sum + number%10;
		    number=number/10;
		    
		
		}
		return sum;
	}

}
