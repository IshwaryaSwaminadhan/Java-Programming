package assigmentDay5;

import java.util.Scanner;

public class Countnumdigit {

	public static void main(String[] args) {
		
		//int num = 1245662;
		
Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		
		int count = 0;
		
		while(num!=0) {
			
			num=num/10;
			count++;		
		}
		System.out.println(count);
	}

}
