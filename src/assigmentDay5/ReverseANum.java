package assigmentDay5;

import java.util.Scanner;

public class ReverseANum {

	public static void main(String[] args) {
		
		// Reverse a number 
		/*
		 * Input : 1234
		 * Output :4321
		 */
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		
		//int num=1234;6932
		
		int rev=0;
		while(num>0) { // we can write logic as follows--> (num!=0)
			
			rev=rev*10+num%10; //
			
			//System.out.println(rev);
			num=num/10;//
			
			//System.out.println(num);
		}
		System.out.println(rev);
	}
	
}