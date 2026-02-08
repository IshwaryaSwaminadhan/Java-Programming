package day13;

public class StaticDemo {
	
	
	static int a=10; // Static Variable
	int b=20; // non static variable
	
	static void m1() { // Static method 
		
		System.out.println("This is m1 static method");
	}
	
	void m2() {  // Non-Static Method
		System.out.println("This is m2 static method");
	}
	
	void m() {
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}
	
	public static void main(String[] args) {
		
	/* 	//1) Static methods can access static stuff directly ( Without object ).
	
		System.out.println(a);
		m1();
		
		// System.out.println(b); // cannot access, b is non-static
		// m2();  // cannot access, m2() is non-static
		
		// 2) static methods can access non-static stuff through objects
		StaticDemo sd =new StaticDemo();
		
		//System.out.println(sd.b);
		
		//sd.m2();
		
		sd.m();
		
		 */
		
	}

}
