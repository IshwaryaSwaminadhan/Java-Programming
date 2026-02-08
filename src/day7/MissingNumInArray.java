package day7;

public class MissingNumInArray {

	public static void main(String[] args) {
		// Missing Number in Array
        int a[]= {1,2,3,4,5,6,7,9};
        
        int sum1=0;
        
        for(int i=0;i<a.length ;i++) {
        	
        	sum1=sum1+a[i];
        	
        }
    	
        System.out.println("Sum of the arrays Elements :" +sum1);
        
        int sum2=0;
        
        for(int i=1;i<=9;i++) {
        	
        	sum2=sum2+i;
        }
        
        System.out.println("Sum of the range of Elements :" +sum2);
        
        System.out.println("Missing array Element :" +(sum2-sum1));
        
	}

}
