package day11;

public class GreetingMain {

	public static void main(String[] args) {
		
		Greetings gr=new Greetings();
		gr.m1();
		
		String s = gr.m2();
		System.out.println(s);
		
		gr.m3("Jonita", 36);
		
		String se= gr.m4("Sam", 29);
		System.out.println(se);
	}

}
