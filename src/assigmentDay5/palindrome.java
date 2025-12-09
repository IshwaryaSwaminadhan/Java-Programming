package assigmentDay5;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		
		// Print a palindrome number
		/*
		 * input 121
		 * output 121
		 */
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		
		int org_num =num;
		int rev=0;
		
		while(num!=0) {
			
			rev=rev*10+num%10;
			num=num/10;
			
		}
		
		if(rev== org_num) {
			System.out.println(rev+" : Palindrome number");
		}
		else {
			System.out.println(rev+" : Not a Palindrome number");
		}	

	}

}
