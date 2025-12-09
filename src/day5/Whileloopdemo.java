package day5;

public class Whileloopdemo {

	public static void main(String[] args) {
		
		// Example 1 :  print 1 to 10 numbers
		
		/*  int i = 1;    //Initialization
		
		while(i<=10) {   // Condition
			
			System.out.println(i);
			
			i++;  // Increment 
			
		} 			*/
		
		// Example 2 : print Hello message 10 times
		
	/*	int i=1;
		while(i<=10) {
			
			System.out.println("Hello");
			i++;
			
		}  */
		
	// Example 3 : print even numbers between 1 to 10
		
		//Approach1
		
	/*	int i=2;
		while (i<=10) {
			
			System.out.println(i);
			
			i+=2; //i=i+2;
		}  */
		
		//Approach2
		
		/*	int i=1;
		
		while(i<=10) {
			
			if(i%2==0) {
				System.out.println(i);
			}
			i++;
			
		} */
		
		// Example 4 : 1..........10 print the numbers following output
		
		/*   
		 * 1 odd
		 * 2 even
		 * 3 odd
		 * 4  odd
		 * ...............
		 * 10 even	 
		 */
		
		
		/* 	int i=1;
		while(i<=10) {
			
			if(i%2==0) {
				System.out.println(i+"even");
			}
			else {
				System.out.println(i+"odd");
			}
			
			i++; 
		}  */
		
		// Example5 : print 10 to 1 in descending order
		
		int i=10;
		
		while((i>0)|| i>=1) {
			
			System.out.println(i);
			
			i--;			
		}
		
		
	}

}
