package org.howard.edu.lsp.assignment7;
import static org.junit.jupiter.api.Assertions.*;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PolynomialTest {
	Polynomial poly1 = new Polynomial();
	Polynomial poly2 = new Polynomial();
	Polynomial poly3 = new Polynomial();
	Polynomial poly4 = new Polynomial();
	
	/**
	 * JUnit test for prodct()
	 */
	@Test
	@DisplayName("Test product()")
	public void testProduct() {
    	var term1 = new Term(3,9);
    	var term2 = new Term(4,6);
    	var term3 = new Term(5,3);
    	var term4 = new Term(8,2);
    	var term5 = new Term(5,1);
    	var term6 = new Term(3,0);
    	poly1.insert(term1);
    	poly1.insert(term2);
    	poly1.insert(term3);
    	poly1.insert(term4);
    	poly1.insert(term5);
    	poly1.insert(term6);
    	var product = poly1.product(poly1);
		System.out.println("Original poly1: " + poly1.toString());
		System.out.println("Product of poly1: " + product.toString() + "\n");
		assertEquals(product.toString(), "7200x^21");
	}
	
	/**
	 * JUnit test for insert()
	 */
	@Test
	@DisplayName("Test insert()")
	public void testInsert() {
    	var term1 = new Term(3,9);
    	var term2 = new Term(4,6);
    	var term3 = new Term(5,3);
    	poly2.insert(term1);
		System.out.println("Insertion1 of poly2: " + poly2.toString());
    	poly2.insert(term2);
		System.out.println("Insertion2 of poly2: " + poly2.toString());
    	poly2.insert(term3);    	
		System.out.println("Insertion3 of poly2: " + poly2.toString());
		assertEquals(poly2.toString(), "3x^9 + 4x^6 + 5x^3");
	}
	
	/**
	 * JUnit test for reverse()
	 */
	@Test
	@DisplayName("Test reverse()")
	public void testReverse() {
    	var term1 = new Term(5,4);
    	var term2 = new Term(4,3);
    	var term3 = new Term(5,1);
    	var term4 = new Term(10,0);

    	poly3.insert(term1);
    	poly3.insert(term2);
    	poly3.insert(term3);    	
    	poly3.insert(term4);    	
    	
		System.out.println("Original poly3: " + poly3.toString());
		poly3.reversePolynomial();
		System.out.println("Reverse poly3: " + poly3.toString()+ "\n");
		assertEquals(poly3.toString(), "10 + 5x + 4x^3 + 5x^4");
	}
	
	/**
	 * JUnit test for delete()
	 */
	@Test
	@DisplayName("Test delete()")
	public void testDelete() {
    	var term1 = new Term(6,9);
    	var term2 = new Term(12,6);
    	var term3 = new Term(3,3);
    	var term4 = new Term(35,2);
    	var term5 = new Term(3,1);
    	
    	poly4.insert(term1);
    	poly4.insert(term2);
    	poly4.insert(term3); 
    	poly4.insert(term4);
    	poly4.insert(term5);
		System.out.println("Original poly4: " + poly4.toString());
		
		poly4.delete(term5);
		System.out.println("Deletion1 poly4: " + poly4.toString());
		poly4.delete(term4);
		System.out.println("Deletion2 poly4: " + poly4.toString());
		poly4.delete(term3);
		System.out.println("Deletion3 poly4: " + poly4.toString());
		poly4.delete(term2);
		System.out.println("Deletion4 poly4: " + poly4.toString() + "\n");
		
		assertEquals(poly4.toString(), "6x^9");
	}
	

}