package day14;

class Parents{
	
	void display(int a) {
		System.out.println(a);
		
	}		
}
class child1 extends Parents {
	
	void show(int b) {
		System.out.println(b);
		
	}	
}

class child2 extends Parents{
	
	void print(int c) {
		System.out.println(c);			
	}
	
}
public class HierarchyInheritance {
	


	public static void main(String[] args) {
		
		child1 C1 =new child1();
		
		C1.display(200);
		C1.show(300);
		
		child2 C2 =new child2();
		
		C2.display(1000);
		C2.print(2000);
	}

}
