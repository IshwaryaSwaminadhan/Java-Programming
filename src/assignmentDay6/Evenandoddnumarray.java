package assignmentDay6;

public class Evenandoddnumarray {

	public static void main(String[] args) {
	
			// Print even and odd number from array --> a={1,2,3,4,5}
			
			int a[]= {10,2,31,41,5};
			//System.out.println(a[2]);
			
			System.out.println("Even numbers in the array ........");
			for(int i = 0;i<a.length;i++) {
				
		//int sum=a[i]%10;
		//System.out.println("Even Numberddff :"+sum);
				
				if((a[i]%2)==0) {
					
					System.out.println(a[i]);
				
				}
			}
			
			System.out.println("Odd numbers in the array ........");
			
			for(int i=0;i<a.length;i++) {
				
				if(((a[i]%2)!=0)) {
					System.out.println(a[i]);								
				}
				
			}
		}

	}


