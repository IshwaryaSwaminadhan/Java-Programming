package day17.pack2;

import day17.pack1.*; // we can import more than one class in a package we use *

public class Test2 extends Test1 {

	public static void main(String[] args) {
		
		Test2 t2=new Test2();
		System.out.println(t2.x);
		t2.m1();
		
		
		/* Test1 t=new Test1();
		System.out.println(t.x);
		t.m1();  */
		
		
	}

}
