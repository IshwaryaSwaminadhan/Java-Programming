package day12;

public class Adder {

	int a=10; int b=20;
	
	void sum() {    //Method1
		System.out.println(a+b);
	}
	
	void sum(int x, int y) { //Method2
		
		System.out.println(x+y);		
	}	 
	void sum(int x, double y) { //Method3
		System.out.println(x+y);	
	}
	
	void sum(double x, int y) {  //Method4
		System.out.println(x+y);	
	}
	
	void sum(int x,int y, int z) { //Method5
		
		System.out.println(x+y+z);		
	}
}
