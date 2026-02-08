package assignmentDay6;

public class SumofElementsarray {

	public static void main(String[] args) {
		/* Sum of elements in Array
		 a={1,2,3,4,5}
		o/p:- Sum =15
		 */	
		int a[]= {5,6,7,9,8}; // n-5		 n-1=4 (Indexes)
		int sum=0;
		/* for(int i = 0;i<a.length;i++) { // 5 6 7 9 8    //a.length-1=4
			//System.out.println(a[i]);
			
			 sum=sum+a[i];		 //5+6+7+9+8
		}
		
		System.out.println("Sum of arrays :"+sum); */
		
		// Enhanced For Loop
		
		for(int value:a) {
			sum=sum+value;		
		}
		
		System.out.println("Sum of arrays :"+sum);
	}

}
