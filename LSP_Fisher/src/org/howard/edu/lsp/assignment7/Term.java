package org.howard.edu.lsp.assignment7;

public class Term {
	private int coefficient;
	private int exponent;
	
	/**
	 * Constructor that creates a Term object with a coefficient and exponent passed as parameters
	 * @param coefficient
	 * @param exponent
	 */
	public Term(int coefficient, int exponent){
		this.coefficient = coefficient;
		this.exponent = exponent;
	}
	
	/**
	 * Accessor method that returns the coefficient
	 * @return this.coefficient
	 */
	public int getCoefficient() {
		return this.coefficient;
	}
	
	/**
	 * Accessor method that returns the exponent
	 * @return this.exponent
	 */
	public int getExponent() {
		return this.exponent;
	}

	/**
	 * method that returns a Term object as a String
	 */
	public String toString() {
		if (this.exponent == 0) {
			return this.coefficient + "";
		}
		else if (this.exponent == 1) {
			return this.coefficient + "x";
		}
		else if (this.coefficient == 1) {
			return "x^" + this.exponent;
		}
		else if (this.coefficient == 0) {
			return "";
		}
		else if (this.coefficient == 1 && this.exponent == 1) {
			return "x";
		}
		return this.coefficient + "x^" + this.exponent;
	}
}
