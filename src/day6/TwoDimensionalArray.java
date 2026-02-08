package day6;


/*
1)Declare an array
2)add values into array
3)find size/length of an array
4)Read single value from array
5)Read multiple values from array 	 	
  
 */
public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		// 1)Declaring an two dimensional array

		// Approach1
		/* int a[][]= new int[3][2]; // it will allocate 3 rows and 2 columns like this 
		
		/*  			   c1 c2
		 *  Index  		   0 1
				0	    r1 2 4
				1	    r2 4 6
				2	    r3 8 9   */
		
	//	2)add values into array
		/* 	
		a[0][0] =100;
		a[0][1] =200;
		
		a[1][0] =300;
		a[1][1] =400;
		
		a[2][0] =500;
		a[2][1] =600; */
		
		// Approach2
		
		int a[][]= { {100,200},
					{300,400},
					{500,600}
				};
		
		// 3)find size/length of an array
		System.out.println("Length of a row : " +a.length);
		System.out.println("Length of a column : " +a[0].length);
		
//		4)Read value from array
	//	System.out.println(a[2][1]); // 600
		
		// Normal For Loop
		
	/* 	for(int r=0;r<a.length;r++) { // 0 1 2 3
			
			for(int c=0;c<a[r].length;c++) {  //0 1 2  		 c<=a[r].length-1
				
				System.out.print(" "+a[r][c]); // 100 200 300 400 500 600 
				
			}
			System.out.println();
					
		} */
		
		// Enhanced For-each Loop
		
		for(int arr[]:a) {
			for(int x:arr) {
			System.out.print(x+" ");
			}
			System.out.println(" "); 
		}
	
		
	}

}
