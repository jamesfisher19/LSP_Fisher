package org.howard.edu.lsp.assignment5.integerset;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


/**
 * JUnit test class for IntegerSet.java
 * @author jamesfisher
 *
 */
class IntegerSetTest {
	private IntegerSet intSet = new IntegerSet();
	private IntegerSet intSet2 = new IntegerSet();
	private IntegerSet intSet3 = new IntegerSet();
	private IntegerSet intSet4 = new IntegerSet();
	private IntegerSet intSet5 = new IntegerSet();
	private IntegerSet intSet6 = new IntegerSet();
	private IntegerSet intSet7 = new IntegerSet();
	
	
	
	/**
	 * Set up integer sets & fill intSet1 through intSet4 with values
	 */
	@BeforeEach
	public void init() {
		intSet = new IntegerSet();
		intSet2 = new IntegerSet();
		intSet3 = new IntegerSet();
		intSet4 = new IntegerSet();
		intSet5 = new IntegerSet();
		intSet6 = new IntegerSet();
		intSet7 = new IntegerSet();
		
		
		//Integer Set 1
		intSet.add(1);
		intSet.add(2);
		intSet.add(3);
		intSet.add(4);
		intSet.add(5);
		intSet.add(1867);

		//Integer Set 2
		intSet2.add(10);
		intSet2.add(20);
		intSet2.add(30);
		intSet2.add(40);
		intSet2.add(50);
		intSet2.add(1867);
		
		//Integer Set 3
		intSet3.add(11);
		intSet3.add(22);
		intSet3.add(33);
		intSet3.add(44);
		intSet3.add(55);
		
		//Integer Set 4
		intSet4.add(11);
		intSet4.add(22);
		intSet4.add(33);
		intSet4.add(44);
		intSet4.add(55);
		
		intSet6.add(100);
		intSet6.add(200);
		intSet6.add(300);
		intSet6.add(400);
		intSet6.add(500);
		
		intSet7.add(400);
		intSet7.add(500);
		intSet7.add(600);
		intSet7.add(700);
		intSet7.add(800);
		
	}
	
	
	/**
	 * JUnit tests for add()
	 */
	@Test
	@DisplayName("Test to add 5 to given set (True)")
	public void testAdd1() {
		boolean val = intSet.contains(5);
		assertTrue(val == true);
	}
	@Test
	@DisplayName("Test to add 20 to given set (True)")
	public void testAdd2() {
		boolean val = intSet2.contains(20);
		assertTrue(val == true);
	}
	@Test
	@DisplayName("Test to add 33 to given set (True)")
	public void testAdd3() {
		boolean val = intSet3.contains(33);
		assertTrue(val == true);
	}
	@Test
	@DisplayName("Test to add 44 to given set (True)")
	public void testAdd4() {
		boolean val = intSet4.contains(44);
		assertTrue(val == true);
	}
	@Test
	@DisplayName("Test to add 6 to given set (False)")
	public void testAdd5() {
		boolean val = intSet4.contains(6);
		assertTrue(val == false);
	}
	
	
	/**
	 * JUnit tests for length()
	 */
	@Test
	@DisplayName("Test to find length of given set")
	public void testLength() {
		int len = intSet.length();
		assertEquals(6, len);
	}
	
	
	/**
	 * JUnit tests for contains()
	 */
	@Test
	@DisplayName("Test to see if set contains value (True)")
	public void testContains1() {
		boolean val = intSet.contains(5);
		assertTrue(val == true);
	}
	@Test
	@DisplayName("Test to see if set contains value (False)")
	public void testContains2() {
		boolean val = intSet.contains(20);
		assertTrue(val == false);
	}

	/**
	 * JUnit tests for equals()
	 */
	@Test
	@DisplayName("Test to see if intSet == intSet2 (False)")
	public void testEquals() {
		boolean equal = intSet.equals(intSet2);
		assertTrue(equal == false);
	}
	@Test
	@DisplayName("Test to see if intSet3 == set 4 (True)")
	public void testEquals2() {
		boolean equal = intSet3.equals(intSet4);
		assertTrue(equal == true);
	}
	
	/**
	 * JUnit tests for largest() 
	 */
	@Test
	@DisplayName("Test to find largest value in intSet. Throw exception if empty")
	public void testLargest1() throws IntegerSetException {
		int largestNum = intSet.largest();
		assertEquals(1867, largestNum);
	}
	@Test
	@DisplayName("Test to find largest value in intSet3. Throw exception if empty")
	public void testLargest2() throws IntegerSetException {
		int largestNum = intSet3.largest();
		assertEquals(55, largestNum);
	}
	
	/**
	 * Test largest IntegerSetException 
	 * @throws IntegerSetException
	 */
	@Test
	@DisplayName("Test largest() IntegerSetException")
	public void testLargestException() throws IntegerSetException {
		Exception exception = assertThrows(IntegerSetException.class, () -> {
			intSet5.largest();
			intSet4.largest();
		});
		assertEquals("IntegerSet.largest threw an exception because it was empty!", exception.getMessage());
	}
	
	/**
	 * JUnit tests for smallest() 
	 */
	@Test
	@DisplayName("Test to find smallest value in intSet. Throw exception if empty")
	public void testSmallest1() throws IntegerSetException {
		int smallestNum = intSet.smallest();
		assertEquals(1, smallestNum);
	}
	@Test
	@DisplayName("Test to find smallest value in intSet3. Throw exception if empty")
	public void testSmallest2() throws IntegerSetException {
		int smallestNum = intSet3.smallest();
		assertEquals(11, smallestNum);
	}
	
	/**
	 * Test smallest() IntegerSetException 
	 * @throws IntegerSetException
	 */
	@Test
	@DisplayName("Test smallest() IntegerSetException")
	public void testSmallestException() throws IntegerSetException {
		Exception exception = assertThrows(IntegerSetException.class, () -> {
			intSet5.smallest();
			intSet4.smallest();
		});
		assertEquals("IntegerSet.smallest threw an exception because it was empty!", exception.getMessage());
	}
	

	/**
	 * JUnit tests for remove()
	 */
	@Test
	@DisplayName("Test to remove value from intSet")
	public void testRemove1() throws IntegerSetException {
		intSet.remove(5);
		assertTrue(intSet.contains(5) == false);
	}
	@Test
	@DisplayName("Test to remove value from intSet")
	public void testRemove2() throws IntegerSetException {
		intSet.remove(50);
		assertTrue(intSet.contains(50) == false);
	}

	/**
	 * Test remove() IntegerSetException 
	 * @throws IntegerSetException
	 */
	@Test
	@DisplayName("Test remove() IntegerSetException")
	public void testRemoveException() throws IntegerSetException {
		Exception exception = assertThrows(IntegerSetException.class, () -> {
			intSet5.remove(1);
			intSet5.remove(5);
			intSet5.remove(3);
		});
		assertEquals("IntegerSet.remove threw an exception because it was empty!", exception.getMessage());
	}
	
	
	/**
	 * JUnit tests for isEmpty()
	 */
	@Test
	@DisplayName("Test to check if intSet5 is empty (True)")
	public void testIsEmpty1() {
		boolean empty = intSet5.isEmpty();
		assertTrue(empty == true);
	}
	@Test
	@DisplayName("Test to check if intSet3 is empty (False)")
	public void testIsEmpty2() {
		boolean empty = intSet3.isEmpty();
		assertTrue(empty == false);
	}

	/**
	 * JUnit tests for toString()
	 */
	@Test
	@DisplayName("Test to turn intSet3 to string")
	public void testToString1() {
		String empty = intSet3.toString();
		assertEquals("11 22 33 44 55 ", empty);
	}
	@Test
	@DisplayName("Test to turn intSet4 to string")
	public void testToString2() {
		String empty = intSet4.toString();
		assertEquals("11 22 33 44 55 ", empty);
	}
	
	/**
	 * JUnit tests for intersect()
	 */
	@Test
	@DisplayName("Test to check the intersection between intSet6 & intSet7")
	public void testIntersect() {
		intSet6.intersect(intSet7);
		assertEquals(intSet6.toString(), "400 500 ");
	}
	
	
	/**
	 * JUnit tests for union()
	 */
	@Test
	@DisplayName("Test to check the union between intSet6 & intSet7")
	public void testUnion() {
		intSet6.add(100);
		intSet6.add(200);
		intSet6.add(300);

		intSet6.union(intSet7);
		assertEquals(intSet6.toString(), "100 200 300 400 500 600 700 800 ");
	}
	
	/**
	 * JUnit tests for diff()
	 */
	@Test
	@DisplayName("Test to check the difference between intSet6 & intSet7")
	public void testDiff() {
		intSet6.clear();
		intSet7.clear();
		
		intSet6.add(100);
		intSet6.add(200);
		intSet6.add(300);
		intSet6.add(400);
		intSet6.add(500);
		
		intSet7.add(400);
		intSet7.add(500);
		intSet7.add(600);
		intSet7.add(700);
		intSet7.add(800);
		
		
		intSet6.diff(intSet7);
		assertEquals(intSet6.toString(), "100 200 300 ");
	}
	
	/**
	 * JUnit tests for clear()
	 */
	@Test
	@DisplayName("Test to clear intSet6")
	public void testClear() {
		intSet6.clear();
		assertEquals(0, intSet6.length());
	}
}
