package day4;

public class Largestof3Numbers {

	public static void main(String[] args) {

		/* 
		 a>b and a>c --> a is largest number
		 b>a and b>c --> b is largest number 
		 c>a and c>b --> c is largest number
		 */
		int a=10,b=20,c=30;
		
		if(a>b && a>c) {
			
			System.out.println("a is largest number"+a);		
		}
		else if(b>a && b>c){
			
			System.out.println("b is the largest number"+b);		
		}
		else {
			System.out.println("c is largest number"+" "+c);
		}

	}

}
