package day20;

import java.util.ArrayList;
import java.util.Iterator;
//import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		// Declaration 
		
		ArrayList <Object> mylist =new ArrayList<Object>();
		
		//List mylist=new ArrayList();  // this declaration is always best for real time projects and its best for industry standards 
		// ArrayList<String> mylist =new ArrayList<String>();
		 
		 mylist.add(100);
		 mylist.add(10.5);
		 mylist.add('A');	
		 mylist.add("welcome");
		 mylist.add(null);
		 mylist.add(true);
		 mylist.add(null);
		 mylist.add(100);
		 
		 //  Size of ArrayList
		 System.out.println("Size of an arraylst :"+mylist.size()); //
		 
		 // Printing ArrayList
		 System.out.println("Printing data from arraylist :"+mylist); //[100, 10.5, A, true, welcome, null, null, 100]
		 
		 // Remove element from arraylist	 
		 mylist.remove(5);
		 System.out.println("After Removing :"+mylist);  // [100, 10.5, A, welcome, null, null, 100]
		 
		 // Insert element in the arraylist
		 mylist.add(2, "Jonita Gandhi");
		 System.out.println("After Insertion:"+mylist); // [100, 10.5, Jonita Gandhi, A, welcome, null, null, 100]
		 
		 // Modify element in the arraylist (modify/replace/change)
		 mylist.set(2, "Akash Gandhi");
		 System.out.println("After replacing:"+mylist);
		 
		 // Access Specific elements from arraylist
		 
		System.out.println(mylist.get(2)); // here 2 is index // Akash Gandhi

		// Reading all elements from the ArrayList
		
		// Using Normal For-Loop
		
	/*	for(int i=0;i<mylist.size();i++) {
			
			System.out.println(mylist.get(i));
		}
		
		*/
		// Using for..each loop
		
	/*	for(Object x:mylist) {
			
			System.out.println(x);
		}
		*/
		//using Iterator
		
		Iterator<Object> It =mylist.iterator();
		
		while(It.hasNext()) {
			
			System.out.println(It.next());
		}
		
		// Checking arraylist is empty or not
	System.out.println("Is arraylist empty ? :"+mylist.isEmpty());	
	
	
	// Remove all the elements from array list
	
	ArrayList <Object> mylist2 =new ArrayList<Object>();
	
	
	mylist2.add(100);
	mylist2.add(10.5);
	mylist2.add(true);	
	
	// removeall(); removed the array list based on requirement 
	mylist.removeAll(mylist2);
	
	System.out.println(mylist); //  [Akash Gandhi, A, welcome, null, null]
	
	//but if u want to remove the all elements in the array list we can use 'Clear()' method. 
	
	// remove all the elements/clear
	mylist.clear();
	
	System.out.println("Is arraylist empty ? :"+mylist.isEmpty());	
	
	}
	

	
	
	
	
	
	
	
	
	
	

}
