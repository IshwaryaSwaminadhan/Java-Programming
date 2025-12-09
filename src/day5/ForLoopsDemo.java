package day5;

public class ForLoopsDemo {

	public static void main(String[] args) {
		
		// Example 1 :  print 1 to 10 numbers
		
		/* for(int i=1;i<=10;i++) {
			
			System.out.println(i);
			
		} */
		
		// Example 2 : print Hello message 10 times
		/* for(int i=1;i<=10;i++) {
			
			System.out.println("Hello");
			
		} */
		
		// Example 3 : print even numbers between 1 to 10
		//Approach 1
		
		/* for(int i=2;i<=10;i+=2) {
			
			System.out.println(i);	
		} 
		*/ 
		
		//Approach 2
		
	/*	for(int i=1;i<=10;i++) {
			
			if(i%2==0) {
				
				System.out.println(i);
			}
			
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
		
		/* for(int i=1;i<=10;i++) {
			
			if(i%2==0) {
				System.out.println(i+" "+"Even");
			}
			else {
				System.out.println(i+" "+"Odd");
			}
		}  */
		
		// Example5 : print 10 to 1 in descending order
		
		for(int i=10;i>=1;i--){
			
			System.out.println(i);	
		}
		
		
	}

}
