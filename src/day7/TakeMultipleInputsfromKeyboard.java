package day7;

import java.util.Scanner;

public class TakeMultipleInputsfromKeyboard {

	public static void main(String[] args) {
		// Taking multiple inputs from keyboard
		Scanner sc=new Scanner(System.in);
		
	/*	System.out.println("Enter the First number");
		
		int num1=sc.nextInt();
		
		System.out.println("Enter the Second number");
		
		int num2=sc.nextInt();
		
		System.out.println("Addition of two numbers : "+(num1+num2));
		*/
		
		System.out.println("Enter your name : ");
		String name=sc.next();
		
		System.out.println(" your name is : "+name);
		
		System.out.println("Enter your age");
		int age=sc.nextInt();
		System.out.println(" your name is : "+age);
		
		System.out.println("Enter unknown value : ");
		Object unvalu=sc.next();
		
		System.out.println(" Unknown Value is : "+unvalu);
		
	      sc.close();
	}

}
