package day10;

public class EmployeeMain {

	public static void main(String[] args) {
				
			Employee emp1=new Employee();
			emp1.eid=201;
			emp1.ename="Jonita";
			emp1.job="Singer";
			emp1.sal=10000;
			
			emp1.display();
			
			Employee emp2=new Employee();
			emp2.eid=203;
			emp2.ename="Sam";
			emp2.job="Actor";
			emp2.sal=100002;
			
			emp2.display();

	}
}
