package day2;

public class Variablesdemo {

	public static void main(String[] args) {
		/* int a ; 		//declaration
		a=100; 			// assignment
		System.out.println(a);		*/
		
		/* int a = 100; 	//declaration+assignment
		System.out.println(a);
		
		a=200;
		System.out.println(a);		*/
		
		//Approach1 --  if all the variables are belongs to different data types
		
		/* int a = 100; /declaration+assignment
		int b = 200;
		int c = 300; */
		
		// Approach2 -- This approach will applicable for the --> if all the variables are belongs to same data types like int data types 
		
		/* int a, b,c ; //declaration
		a=100;  	// assignment
		b=200;
		c= 300;  */
		
		// Approach3 -- This approach will applicable for the --> if all the variables are belongs to same data types like int data types 
		
		int a=100,b=200,c=300; 
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		// what if i want to print in one single line of all these a,b,c
		System.out.println(a+" "+b+" "+c);
		
		
	}

}
