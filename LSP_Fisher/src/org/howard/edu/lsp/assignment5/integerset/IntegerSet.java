package org.howard.edu.lsp.assignment5.integerset;
import java.util.*;

/**
 * Class that creates a list, with multiple functions: clear, length, equals,
 * contains, largest, smallest, add, remove, union, intersect, difference, and isEmpty
 */
public class IntegerSet extends Exception {
	// Hint: probably best to use an array list.  You will need to do a little research
	private List<Integer> set = new ArrayList<Integer>();
	
	/**
	 * Default Constructor
	 */
	public void Set() {};

	/**
	 * Clears the internal representation of the set
	 */
	public void clear() {
		set.clear();
	};
	/**
	 * @return length of the set
	 */
	public int length() {
		return set.size();
	}; // returns the length
	
	/**
	 * 
	 *Returns true if the 2 sets are equal, false otherwise;
	 * @param b holds value of list that's being compared
	 * Two sets are equal if they contain all of the same values in ANY order.
	 */
	public boolean equals(IntegerSet b) {
		List<Integer> set2 = b.set;
		
		if (set.size() != set2.size()){
			return false;
		}
		Collections.sort(set);
		Collections.sort(set2);
		
		if (set.equals(set2)) {
			return true;
		}else {
			return false;
		}
	};
	
	/**
	 * @param value holds integer in question
	 * @return true if the set contains the value, otherwise returns false
	 */
	public boolean contains(int value) {
		for (int i=0; i<set.size(); i++) {
			if (set.get(i) == value) {
				return true;
			}
		}
		return false;
	};   
	
	/**
	 * @return Returns the largest item in the set
	 * Throws IntegerSetException if the set is empty
	 */
	public int largest() throws IntegerSetException {
		if (set.isEmpty() == true) {
			throw new IntegerSetException("IntegerSet.largest threw an exception because it was empty!");
		};
		
		int maxNum = Collections.max(set);

		return maxNum;};
	
	/**
	 * @return Returns the smallest item in the set; 
	 * Throws IntegerSetException if the set is empty
	 */
	public int smallest() throws IntegerSetException{
		if (set.isEmpty() == true) {
			throw new IntegerSetException("IntegerSet.smallest threw an exception because it was empty!");
		}
		int minNum = Collections.min(set);
		return minNum;
	};
	
	/**
	 * Adds an item to the set or does nothing it already there
	 * @param item to be added to list
	 * Throws IntegerSetException if the set is empty
	 */
	public void add(int item){
		if (contains(item) == false) {
			set.add(item);
		}
	}; 
	
	/**
	 * Removes an item from the set or does nothing if not there
	 * @param item to be removed from list
	 * Throws IntegerSetException if the set is empty
	 */
	public void remove(int item) throws IntegerSetException {
		if (set.isEmpty() == true) {
			throw new IntegerSetException("IntegerSet.remove threw an exception because it was empty!");
		}
		if (contains(item) == true) {
			set.removeAll(Arrays.asList(item));
		}
	};
	
	/**
	 * Find union between two sets
	 * @param intSetb to be compared to original set 
	 */
	public void union(IntegerSet intSetb) {
		List<Integer> set2 = intSetb.set;
		set.addAll(set2);

		Set<Integer> noDuplicates = new LinkedHashSet<>(set);
		set.clear();
		set.addAll(noDuplicates);
	};
	
	/**
	 * Find intersection between two sets
	 * @param intSetb to be compared to original set 
	 */
	public void intersect(IntegerSet intSetb) {
		List<Integer> set2 = intSetb.set;
		set.retainAll(set2);
	};
	
	/**
	 * Find difference between two sets
	 * @param intSetb to be compared to original set
	 */
	public void diff(IntegerSet intSetb) {
		List<Integer> set2 = intSetb.set;
		set.removeAll(set2);
		System.out.println(set);
	}; 
	
	/**
	 * @return Returns true if the set is empty, false otherwise
	 */
	public boolean isEmpty() {
		if (set.size() == 0) {
			return true;
		}else {
			return false;
		}
	};
	
	/**
	 * @return Return String representation of set
	 */
	public String toString() {
       String list = "";
       for(int i=0; i<set.size(); i++){
		   list += set.get(i) + " ";
       }
       return list;
	};

	public static void main(String[] args){
		System.out.println("test");
	}
}


