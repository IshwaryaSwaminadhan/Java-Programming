
package day6;

/*
1)Declare an array
2)add values into array
3)find size/length of an array
4)Read single value from array
5)Read multiple values from array 	 	
  
 */
public class SingledimensionalArray {

	public static void main(String[] args) {
		
		//1) declaring an array
		
		// Approach1
		
	/*	int a[] =new int[5]; // Declaration 
	 * 
	 * 2)add values into array
		
		a[0]=100;   // Assigning/add values to array 
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		
		//System.out.println(a[4]);
		 		 
		 */
		
		//Approach2
		
		// here we can declare and add values of an array in single line
		
		int a[]= {100,200,300,400,500}; // this is more dynamic way to write this approach 
		

		// 3) Find the length of the array
		
			System.out.println("Lenght of an array : " +a.length);
			
		//	4)Read single value from array
			
			System.out.println(a[2]);
			
		//	5)Read multiple values from array 	 
			
			// Normal for loop
			
	/* 	for(int i=0;i<a.length;i++) { // i<=4 i<4  i<=a.length-1 i<a.length // Here 'i' value is referring as a index of an array 
				
				System.out.println(a[i]); // 100 200 300 400 500
				
			}	 */
			
			// Enhanced For Loop // For...each loop
		for(int x:a) {
			System.out.println(x);
		}
	}

}
