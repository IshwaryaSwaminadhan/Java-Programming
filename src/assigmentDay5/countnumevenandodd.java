package assigmentDay5;

public class countnumevenandodd {

	public static void main(String[] args) {
		// count number of even and odd digits in a number
		int num = 1235662;
		int even_count=0;
		int odd_count=0;
		
		while(num>0) { // 
			
			int rem=num%10;
			
			if(rem%2==0) {
				even_count++;
				
			}
			else {
				odd_count++;
			
			}
			
			num=num/10;
		}
		System.out.println("Even number="+even_count);
		System.out.println("Odd Number ="+odd_count);
	}

}
