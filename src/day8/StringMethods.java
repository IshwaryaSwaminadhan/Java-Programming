package day8;

public class StringMethods {

	public static void main(String[] args) {
		// Declaration of String two types of approaches we have 
		
		//String s ="welcome";
		//String s = new String("welcome");
		//System.out.println(s);
		
		//length()- returns length of String(number of characters in string)
		
		String s="welcome";
		s.length();
		System.out.println(s.length());// 7
		System.out.println("welcome".length());// 7 // we can directly print the characters in the print statements
		
	// concat()- joining strings
		
		String s1="welcome";
		String s2="to java";
		String s3="automation";
		
		System.out.println(s1+s2);	//welcometo java
		System.out.println(s1.concat(s2)); //welcometo java
		
	    System.out.println(s1+s2+s3); //welcometo javaautomation
		System.out.println(s1.concat(s2).concat(s3));//welcometo javaautomation
		System.out.println(s1.concat(s2+s3)); //welcometo javaautomation
		
		System.out.println("welcome"+"to java"); //welcometo java
		System.out.println("welcome".concat("to java")); //welcometo java
		
		// trim()- remove spaces right and left side
		s="   welcome   ";
		System.out.println(s); //print string along with spaces 
		System.out.println("Before trimming :"+s.length());
		
		System.out.println(s.trim());
		System.out.println("After trimmed :"+s.trim().length());
		
		//charAt()- returns a character from a string based on index
		// index starts from 0 
		s="welcome";
		System.out.println(s.charAt(3)); // c
		System.out.println(s.charAt(0)); // w
		
		//contains() -- return true/false -- here it will check that any particular string is part of an main string or not if it is yes it will return output as boolean expression true/false
		System.out.println(s.contains("wel")); //true
		System.out.println(s.contains("come")); // true
		System.out.println(s.contains("WEL")); //false
		System.out.println(s.contains("COME")); //false
		System.out.println(s.contains("welme")); //false -- it will true only when there should be in sequential order  or else it will show false
		
		// equals(); equalsIgnore(); --  compare strings
		s1="welcome";
		s2="welcome";
		
		System.out.println(s1==s2); //true
		System.out.println(s1.equals(s2));//true
		System.out.println(s1.equals("welcome")); //true
		System.out.println(s1.equals("Welcome")); // false --> Case sensitive
		System.out.println(s1.equalsIgnoreCase("WELCOME")); // true --> by this method it ignores the case sensitive
	
	
	}

}
