package day3;

import day10.Students;

public class StudentsMain {

	public static void main(String[] args) {
		
		Students s= new Students();
		s.sname="Mon";
		s.sid=500;
		s.grad='A';
		s.display();
		
		System.out.println(s.sname+"  "+s.sid+"   "+s.grad);
	}

}
