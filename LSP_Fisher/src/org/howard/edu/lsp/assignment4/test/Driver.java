package org.howard.edu.lsp.assignment4.test;
import org.howard.edu.lsp.assignment4.exception.*;
import org.howard.edu.lsp.assignment4.implementation.IntegerSet;

/**
 * Class that tests IntegerSet Class
 */
public class Driver {
	public static void main(String[] args) throws IntegerSetException {

        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        
        try {
        	set1.largest();
        	} catch (IntegerSetException e) {
        		System.out.println(e);
        	}
		// Create Lists
        set1.add(89);
        set1.add(1);
        set1.add(32);
        set1.add(50);
		set1.add(14);
		set1.add(4);
        System.out.println("Set1: " + set1.toString());
        set2.add(89);
        set2.add(1);
        set2.add(32);
        set2.add(50);
		set2.add(14);
		set2.add(4);
		System.out.println("Set2: " + set2.toString());     
		System.out.println("");   

		// Length Method
		System.out.println("Set1 Length: " + set1.length());     
		System.out.println("Set2 Length: " + set2.length());   
		System.out.println("");

		// Equals Method
		System.out.println("Set1 equals Set2? " + set1.equals(set2));
		System.out.println("");

		// Contains Method
		System.out.println("Set1 contains 32? " + set1.contains(32));
		System.out.println("Set1 contains 100? " + set1.contains(100));
		System.out.println("Set2 contains 4? " + set2.contains(4));
		System.out.println("Set2 contains 14? " + set2.contains(14));
		System.out.println("");

		// Largest Method
		try {
			System.out.println("Largest number Set1: " + set1.largest());
		} catch (IntegerSetException e) {
			System.out.println("IntegerSet.largest threw an exception because it was empty! Cannot find largest number in Set1");
		}
		
		try {
			System.out.println("Largest number Set2: " + set2.largest());
		} catch (IntegerSetException e) {
			System.out.println("IntegerSet.largest threw an exception because it was empty! Cannot find largest number in Set1");
		}
		System.out.println("");

		// Smallest Method
		try {
			System.out.println("Smallest number Set1: " + set1.smallest());
		} catch (IntegerSetException e) {
			System.out.println("IntegerSet.largest threw an exception because it was empty! Cannot find smallest number in Set1");
		}
		
		try {
			System.out.println("Smallest number set2: " + set2.smallest());
		} catch (IntegerSetException e) {
			System.out.println("IntegerSet.largest threw an exception because it was empty!Cannot find smallest number in Set2");
		}
		System.out.println("");

		// Remove Method
		System.out.println("Set1 before remove 50: " +  set1);
		System.out.println("Set2 before remove 89: " + set2);
		
		try {
			set1.remove(50);
		} catch (IntegerSetException e) {
			System.out.println("IntegerSet.largest threw an exception because it was empty! Cannot remove 50");
		}
		try {
			set2.remove(89);
		} catch (IntegerSetException e) {
			System.out.println("IntegerSet.largest threw an exception because it was empty! Cannot remove 89");
		}

		System.out.println("Set1 after remove 50: " +  set1);
		System.out.println("Set2 after remove 89: " + set2);
		System.out.println("");

		// Equals Method
		System.out.println("Set1 equals Set2? " + set1.equals(set2));
		System.out.println("");

		//Difference Method 
		set1.diff(set2);
		System.out.println("Difference of Set1 and Set2 : " + set1);
		System.out.println("");

		// isEmpty Method
		System.out.println("Is Set1 empty? " + set1.isEmpty());
		System.out.println("Is Set2 empty? " + set2.isEmpty());
		System.out.println("");

		// Clear
		set1.clear();
		set2.clear();
		System.out.println("(After clear() method) Is Set1 empty? " + set1.isEmpty());
		System.out.println("(After clear() method) Is Set2 empty? " + set2.isEmpty());
		System.out.println("");

		//Test IntegerSetException post clear()
		try {
			System.out.println("Smallest number Set1: " + set1.smallest());
		} catch (IntegerSetException e) {
			System.out.println("IntegerSet.largest threw an exception because it was empty! Cannot find smallest number in Set1");
		}
		
		try {
			System.out.println("Smallest number set2: " + set2.smallest());
		} catch (IntegerSetException e) {
			System.out.println("IntegerSet.largest threw an exception because it was empty!Cannot find smallest number in Set2");
		}
		
		//Add more values
        set1.add(89);
        set1.add(1);
        set1.add(32);
        set1.add(50);
		set1.add(14);
		set1.add(4);
		set1.add(235);
		set1.add(25);
		set1.add(341);
		set1.add(2);
		set1.add(6);
        System.out.println("Set1: " + set1.toString());
        set2.add(89);
        set2.add(1);
        set2.add(32);
        set2.add(50);
		set2.add(14);
		set2.add(4);
		set2.add(32);
        set2.add(510);
		set2.add(456);
		set2.add(98);
		set2.add(123);
        set2.add(502);
		set2.add(143);
		set2.add(41);
		System.out.println("Set2: " + set2.toString());     
		System.out.println(""); 

		// Union Method
		set1.union(set2);
		System.out.println("Union of set1 and set2: " + set1);
		System.out.println("");

		System.out.println("*Set1 & Set2 cleared*");
		System.out.println("");

		// Remake list
		set1.clear();
		set2.clear();

		// isEmpty Method
		System.out.println("Is Set1 empty? " + set1.isEmpty());
		System.out.println("Is Set2 empty? " + set2.isEmpty());
		System.out.println("");

		System.out.println("*Set1 & Set2 repopulated*");
		System.out.println("");

		//Repopulate sets
		set1.add(89);
        set1.add(1);
        set1.add(32);
        set1.add(50);
		set1.add(14);
		set1.add(4);
		set1.add(235);
		set1.add(25);
		set1.add(341);
		set1.add(2);
		set1.add(6);

        set2.add(89);
        set2.add(1);
        set2.add(32);
        set2.add(50);
		set2.add(14);
		set2.add(4);
		set2.add(32);
        set2.add(510);
		set2.add(456);
		set2.add(98);
		set2.add(123);
        set2.add(502);
		set2.add(143);
		set2.add(41);
		System.out.println("Set1: " + set1.toString());
		System.out.println("Set2: " + set2.toString());
		System.out.println("");

		// isEmpty Method
		System.out.println("Is Set1 empty? " + set1.isEmpty());
		System.out.println("Is Set2 empty? " + set2.isEmpty());
		System.out.println("");

		// Intersect Method
		set1.intersect(set2);
		System.out.println("Intersection of set1 and set2: " + set1);
		System.out.println("");
	}

}
