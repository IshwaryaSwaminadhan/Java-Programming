package assigmentDay5;

public class sumofdigits {

	public static void main(String[] args) {
		// sum of digits in a number
		
		int num = 124567;
		
		int sum=0;
		
		while(num>0) {
			
			sum=sum+num%10;
			num=num/10;
		}
		
		System.out.println(sum);
		
	}

}
