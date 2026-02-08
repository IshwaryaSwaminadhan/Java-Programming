package day14;

class Test{
	
	final int x=100;
	
}

public class FinalKeyword1 {

	public static void main(String[] args) {
		
		Test t =new Test();
		
	//	t.x=200; // incorrect, bcoz x is final variable
		
		System.out.println(t.x);
		
	}

}
