package day7;

public class SearchingElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {10,30,40,20,50};
		
		int search_element=30;
		
		boolean status=false;
		
		/* for(int i=0;i<a.length;i++) {
			
			if(a[i]==search_element) {
				System.out.println("Element is found");
				status=true;
				break;
				
			}
			
		}  */
		for(int x:a) {
			if(x==search_element) {
				System.out.println("Element is found");
				status=true;
				break;
				
			}
		}
		
		if(status==false) {
			System.out.println("Element not found");
			
		}
	}

}
