package day11;

public class StudentsMain {

	public static void main(String[] args) {
		
		/* Students stu=new Students();
		
		// 1) Using object reference variable
		
	/*	stu.sid=205;
		stu.sname="Sam";
		stu.grad='A';
		
		stu.PrintStudentData();
		
		*/
		// 2) Using Methods
		/*	stu.setStudentsdata(101, "Jonita", 'A');
		stu.PrintStudentData();*/
		
		//3) Using Constructor
		
		Students stu=new Students(102,"Mon",'B');
		stu.PrintStudentData();
	}

}
