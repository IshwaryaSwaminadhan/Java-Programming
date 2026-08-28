package assginmentDay2;

public class Swapping2numbers {

	public static void main(String[] args) {
		 int a = 10, b = 20;

	        System.out.println("Before swapping values are.." + a + "  " + b);

	        //Logic1 - Third variable
	        /*int t = a;
	        a = b;
	        b = t;*/

	        //Logic2 - use + & - without using third variable
	        /*a = a + b;   //10+20=30
	        b = a - b;   //30-20=10
	        a = a - b;   //30-10=20*/

	        //Logic3 - use * and / without using third variable
	        //here a & b values should not be Zero
	        /*a = a * b;   //10*20=200
	        b = a / b;   //200/20=10
	        a = a / b;   //200/10=20*/

	        //Logic4 - bitwise XOR (^)
	        /*a = a ^ b;   //10^20 =30
	        b = a ^ b;   //30 ^20=10
	        a = a ^ b;   //30^10=20*/

	        //Logic5 - Single statement
	        //a=10  b=20
	        b = a + b - (a = b);

	        System.out.println("After swapping values are.." + a + "  " + b);



	}

}
