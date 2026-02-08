package day7;

import java.util.Arrays;

public class SortingElementsinArray {

	public static void main(String[] args) {
		// Sorting an elements in array
		int a[]= {200,300,100,500,400,200};
		
		 System.out.println("Before Sorting...");
		 
		System.out.println(Arrays.toString(a)); // to print all data from the arrays //[200, 300, 100, 500, 400, 200]
		
		Arrays.sort(a); // Sort elements in array
		
		System.out.println("After Sorting...");
		System.out.println(Arrays.toString(a)); // [100, 200, 200, 300, 400, 500]
	}

}
