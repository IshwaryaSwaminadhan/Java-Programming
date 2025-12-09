package assignment4;

public class Smallest3num {

	public static void main(String[] args) {
		
		int x=100,y=200,z=650;
		if(x<y && x<z) {
			System.out.println("x is smallest number"+" "+x);
		}
		else if (y<x && y<z) {
			System.out.println("y is smallest number"+" "+y);
		}
		else {
			System.out.println("z is smallest number"+" "+z);
		}

	}

}
