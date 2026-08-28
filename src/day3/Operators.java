package day3;

public class Operators {

	public static void main(String[] args) {
		
		// Arithmetic Operators
		     int a = 10, b = 20;

        // Addition
        System.out.println("Sum of a and b is: " + (a + b));

        // Subtraction
        System.out.println("Difference of a and b is: " + (a - b));

        // Multiplication
        System.out.println("Multiplication of a and b is: " + (a * b));

        // Division
        System.out.println("Division of a and b is: " + (a / b));

        // Modular Division
        System.out.println("Modular Division of a and b is: " + (a % b));
        
        // Relational Operators
        System.out.println(a > b);    // true  (20 > 10)
        System.out.println(a < b);    // false (20 < 10)
        System.out.println(a >= b);   // true  (20 >= 10)
        System.out.println(a <= b);   // false (20 <= 10)
        System.out.println(a != b);   // true  (20 != 10)
        System.out.println(a == b);   // false (20 == 10)

        // Logical Operators
        boolean x = true;
        boolean y = false;

        System.out.println(x && y);   // false (AND: both must be true)
        System.out.println(x || y);   // true  (OR: at least one is true)
        System.out.println(!x);       // false (NOT: negation of true)
        System.out.println(!y);       // true  (NOT: negation of false)

        //Assignment Operators
        int a1 = 10;

     // Addition shorthand
     a1 += 5;   // a = a + 5 → a is now 15
     System.out.println(a1);   // 15

     // Subtraction shorthand
     a1 = 10;
     a1 -= 5;   // a = a - 5 → a is now 5
     System.out.println(a1);   // 5

     // Multiplication shorthand
     a1 = 10;
     a1 *= 2;   // a = a * 2 → a is now 20
     System.out.println(a1);   // 20

     // Division shorthand
     a1 = 10;
     a1 /= 2;   // a = a / 2 → a is now 5
     System.out.println(a1);   // 5

     // Modular Division shorthand
     a1 = 10;
     a1 %= 2;   // a = a % 2 → remainder is 0
     System.out.println(a1);   // 0


	}

}
