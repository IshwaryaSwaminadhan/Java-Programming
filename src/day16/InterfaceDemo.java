package day16;

interface Shape {
	// following below things are there in the interface
	
	int lenght=10; // Final & Static Variable
	int width=20; // Final & Static Variable
	
	void circle();  //abstract method
	
	default void square() {
		System.out.println("This is Square - default method");
	}
	
	static void rectangle() {
		
		System.out.println("This is a rectangle - static method");
	}
	
}

public class InterfaceDemo implements Shape {
	
	
	 public void circle() {
		
		System.out.println("this is circle- abstract method");
		
	}
	 
	 void triangle() {
		 
		 System.out.println("this is a triangle .....");
	 }

	 int x=100, y=200;
	 
	public static void main(String[] args) {
		
		// Scenario 1 --> Created the class object
		InterfaceDemo idobj = new InterfaceDemo();
		idobj.circle(); // abstract method
		idobj.square(); // default 
		
		Shape.rectangle(); //  static method can directly access from interface  
		
		System.out.println(idobj.x+idobj.y);
		
		// Scenario 2 -->  creating object for the interface
		
		Shape sh=new InterfaceDemo(); // object of child class can hold into the variable of parent class 
		
		sh.circle(); // abstract
		sh.square(); // default
			
		Shape.rectangle(); //  static method can directly access from interface  
		
		// sh.triangle(); // we cannot access -due to that method is not related to the interface
		
		System.out.println(Shape.lenght * Shape.width); // accessing static variables directly
		

		// System.out.println(sh.x+sh.y); // we cannot access
		
	}

	

}
