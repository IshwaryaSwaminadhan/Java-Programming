package day7;

import java.util.Arrays;
import java.util.Scanner;

public class ReadingandWritingDataIntoArray {

	public static void main(String[] args) {
		
		int a[]=new int[5];
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<a.length;i++) {
			
		
			
			System.out.println("enter a number for "+i+" Position : ");
			
			a[i]=sc.nextInt();
		}
		
		System.out.println(" Printing an array ......");
		
		System.out.println(Arrays.toString(a));
		
	      sc.close();
	}

}
