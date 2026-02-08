package day9;

public class StringComparision {

	public static void main(String[] args) {
		
		// Case 1	
		/* String s1="welcome";
		String s2="welcome";
		System.out.println(s1==s2);// true
		System.out.println(s1.equals(s2));//true */
		
		// Case 2
		String s1=new String("welcome");
		String s2=new String("welcome");
		System.out.println(s1==s2);// false // here it compare the objects
		System.out.println(s1.equals(s2));//true // here it compare the values of object
		
		//Case 3
		//String s1 ="abc";
	}

}
