package day7;

public class FindHowmanyDuplicatesInArray {

	public static void main(String[] args) {
		// Find duplicates in the array

		int a[]= {100,200,300,500,200,500,200,300,};
		int value=200;
		int count=0;
		
		/* for(int i=0;i<a.length;i++) {
			
			if(a[i]==value) {
				count++;
			}
			
		} */
		
		for(int x:a) {
			
			if(x==value) {
				count++;
			}
		}
		System.out.println(count);
		
	}

}
