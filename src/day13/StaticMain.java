package day13;

public class StaticMain {

	public static void main(String[] args) {
				
			//1) Static methods can access static stuff directly ( Without object ).
		
			System.out.println(StaticDemo.a);
			StaticDemo.m1();
			
			// System.out.println(b); // cannot access, b is non-static
			// m2();  // cannot access, m2() is non-static
			
			// 2) static methods can access non-static stuff through objects
			StaticDemo sd =new StaticDemo();
			
			//System.out.println(sd.b);
			
			//sd.m2();
			
			sd.m();
			

	}

}
