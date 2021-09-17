package org.howard.edu.lsp.assignment2;
/** 
 * <h1>Book Class</h1>
 * Creates a book with its title, whether it is borrowed, or whether it is returned. <p>
 * @author James Fisher @/02939673
 * @since 2021-09-16
*/
public class Book { 
	private String title; 
	private boolean borrowed; 
	/**
	 * @param bookTitle used to hold the title of the book
	 */
	public Book(String bookTitle) { 
		this.title = bookTitle;
	 } 
	/**
	 * Marks the book as rented  
	 */
	public void borrowed() { borrowed = true; } 
	/**
	 * Marks the book as not rented
	 */
	public void returned() { borrowed = false; } 
	/**
	 * Returns true if the book is rented, false otherwise public 
	 * @return true if the book is rented and false if not rented
	 */
	public boolean isBorrowed() { 
		if (borrowed == true){
			return true;
		}
		else{
			return false;
		}
	}
	/**
	 * @return title of the book
	 */
	public String getTitle(){ 
		return this.title;
	}
	/**
	 * Tests the possible book titles
	 * @param args
	 */
	public static void main(String[] args) {
        Book test = new Book("Harry Potter");
        System.out.println(test.getTitle());
	  }
}