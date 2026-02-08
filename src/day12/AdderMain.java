package day12;

public class AdderMain {

	public static void main(String[] args) {
		
		Adder addobj =new Adder();
		
		addobj.sum(); // 1
		
		addobj.sum(40, 30); // 2
		
		addobj.sum(20.5, 60); //4
		
		addobj.sum(200, 10.5); //3
		
		addobj.sum(100,200,300); // 5
		
		// addobj.sum(20.5,300.5,10.5); // Invalid // it is not possible because this type of parameters not there in the method.
	}

}
