package org.howard.edu.lsp.assignment7;
import java.util.*;

public class Polynomial {
	ArrayList<Term> list;
	/*
	 * Create an empty list for a new polynomial
	 */
	public Polynomial() {
		list = new ArrayList<Term>();
	}

	/**
	 * Constructor creates polynomial with term
	 * @param term
	 */
	public Polynomial(Term term) {
		list = new ArrayList<Term>();
		list.add(term);
	}
	
	/**
	 * Method that inserts a new term into polynomial
	 * @param term
	 */
	public void insert(Term term) {
		list.add((term));
	}
	
	/**
	 * Method that deletes term from polynomial
	 * @param term
	 */
	public void delete(Term term) {
		if (list.contains(term)) {
			list.remove(term);
		}
		else {
			System.out.println("This term doesn't exists.");
		}
	}
	
	/**
	 * Method that finds the product of all the terms in one polynomial 
	 * @param p 
	 * @return
	 */
	public Polynomial product(Polynomial p) {
		Polynomial prod = new Polynomial();
		int i;
		int coef = 1;
		int exp = 0;
		for (i=0; i<list.size(); i++) {
			coef = coef * list.get(i).getCoefficient();
			exp = exp + list.get(i).getExponent();
		}

		prod.insert(new Term(coef, exp));
		
		return prod;
	}
	public void reversePolynomial() {
		Collections.reverse(list);
	}
	
	/**
	 * Method that turns polynomial to a string format
	 */
	public String toString() {
		int i;
		String stringList = new String();
		for (i=0; i<list.size(); i++) {
			if (i != list.size()-1) {
				stringList = stringList + list.get(i) + " + "; 
			}
			else if (i == list.size()-1) {
				stringList = stringList + list.get(i); 
			}
		}
		return stringList;
	}
}