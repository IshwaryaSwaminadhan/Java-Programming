package day17;

public class DataConversionMethods {

	public static void main(String[] args) {
		
		// String -->int

		// String S="welcome"; // cannot convert to int 
		
	/*
	 	String s1="10";	
		String s2="20";
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));
	*/
		// String -->double
		
		String S1="10.5";
		String S2="20.9";
		System.out.println(Double.parseDouble(S1)+Double.parseDouble(S2));
		
		// String -->boolean
		
		String s="true";   // other than true, if you pass any string that will return false 
		System.out.println(Boolean.parseBoolean(s));
		
		//int ,double,char,boolean --> String
		int a =10;
		double d=10.5;
		char c='A';
		boolean bool=true;
		
		String s3=String.valueOf(a);
		System.out.println(s3);
		
		s3=String.valueOf(d);
		System.out.println(s3);
		
		s3=String.valueOf(c);
		System.out.println(s3);
		
		s3=String.valueOf(bool);
		System.out.println(s3);
	}

}
