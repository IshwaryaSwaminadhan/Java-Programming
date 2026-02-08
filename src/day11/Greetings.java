package day11;

public class Greetings {

	// 1) No Parameters No Return Value
	
	void m1(){
		System.out.println("Heloo...");	
	}
	
	// 2) No Parameters Return Value
	
	String m2() {
		return ("Hello How are you ..?");
	}
	
	// 3) Takes Parameter No Return Value
	
	void m3(String name, int age) {
		System.out.println("Hello :"+name+" and your age is :"+age );
	}
	
	// 4) Takes Parameter Return value
	
	 String m4(String name,int age) {
		return("heloo "+name+"  age is  " +age);
	}
	
}
