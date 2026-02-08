package day7;

import java.util.Scanner;

public class TakingInputFromKeyboard {

	public static void main(String[] args) {
		// Taking input from the Keyboard
		
		// int num=200; hard coded value
		Scanner sc=new Scanner(System.in);
		
		/* System.out.println("Enter a Number :");
		
		int sum = sc.nextInt();			
		System.out.println("Given Number is :"+sum); */
		
		// Enter a decimal number
		
		/* System.out.println("Enter a Decimal Number :");
		
		double sum =sc.nextDouble();
		
		System.out.println("Given Decimal Number is :"+sum); */
		
		
		//Enter your City name
		
		System.out.println("Enter your city name :");
		
		String city =sc.next();
		
		System.out.println("Your city is :"+city);
		
		
	      sc.close();
	}

}
