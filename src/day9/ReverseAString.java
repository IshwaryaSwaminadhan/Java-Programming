package day9;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		// Reverse A String
		//Approach 1 --> length(),charAt()
		
	/*	Scanner sc=new Scanner(System.in);	
		
		System.out.println("Enter a String :");
		String s=sc.next();
		//String s ="Automation";
		String rev=" ";
	
		
		for(int i = s.length()-1;i>=0;i--){
			
			//System.out.println(s.charAt(i));
			rev=rev+s.charAt(i);
		}
		System.out.println("Reverse String is :"+rev);	
		sc.close();
		 */

		// Approach 2 - by converting string to char array type
		/* 
		 String s= "Welcome";
		String rev=" ";
		char a[]=s.toCharArray();
		for(int i=a.length-1;i>=0;i--) {
			
			rev=rev+a[i];		
		}
		
		System.out.println(rev); */
		
		// Approach 3 --> using StringBuffer class
		
		/* StringBuffer s=new StringBuffer("Happy");
		 System.out.println(s.reverse());  */
		
		// Approach 4 -->using StringBulider class
		
		StringBuilder s=new StringBuilder("automation");
		System.out.println(s.reverse());
		
		
		
	}

}
