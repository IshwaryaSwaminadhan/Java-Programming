package day9;

public class StringvsStringBuffervsStringBulider {

	public static void main(String[] args) {
		// String - Immutable 
	/* 	String s="welcome";
		s.concat(" to java");
		System.out.println(s); // welcome//immutable,cannot change original value of s  */
		
		//StringBuffer -Mutable
	/* StringBuffer s=new StringBuffer("welcome");
		s.append("to java");
		System.out.println(s); //welcometo java // mutable, we can change original value of s */
		
		//StringBuffer -Mutable
			StringBuilder s=new StringBuilder("welcome");
			s.append("to java");
			System.out.println(s); //welcometo java // mutable, we can change original value of s 
	}

}
