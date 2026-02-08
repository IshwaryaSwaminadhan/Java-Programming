package day20;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		
		// Declaration 
		HashSet<Object> myset=new HashSet<Object>();
		//Set myset=new HashSet();
		//Set<String> myset =new HashSet<String>();
		
		// adding elements into hash set
		myset.add(100);
		myset.add(10.5);
		myset.add("welcome");
		myset.add(true);
		myset.add('A');
		myset.add(null);
		myset.add(null);
		myset.add(100);
		
		// printing Hashset
		
		System.out.println(myset); //[null, A, 100, 10.5, welcome, true] (Duplicates not allowed and insertion order not preserved)
		
		// Size of an Hashset
		
		System.out.println(myset.size());
		// Removing Element
		myset.remove(10.5);
		
		System.out.println("After Removing :"+myset);

		// Inserting element -Not possible
		
		// Access Specific Element -Not possible
		
		// But it possible to access but not directly but indirectly(work around)
		
		// Convert Hashset into --> Arraylist
		
		ArrayList<Object> al=new ArrayList<Object>(myset);
		System.out.println("after convert :"+al); //[null, A, 100, welcome, true]
		System.out.println(al.get(2));
		
		// Read all elements using for..each
	/*	
		for(Object x:myset) {
			System.out.println(x);
		}
		
		*/
		
		//using Iterator
		
			Iterator<Object> It =myset.iterator();
				
			while(It.hasNext()) {
					
					System.out.println(It.next());
			}
				
			// Clearing all the elements in hash set
			myset.clear();
			System.out.println(myset);
			
			System.out.println("Is arraylist empty ? :"+myset.isEmpty());	
			
	}

}
