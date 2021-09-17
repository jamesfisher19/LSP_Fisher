package org.howard.edu.lsp.assignment2;
import java.util.*;

/**
 * <h1>Library Class</h1>
 * Creates a Library for books from Book class. 
 * In this library, user can add a book, print library hours, 
 * print library addresses, borrow a book, return a book,
 * and print a book's availability.<p> 
 * 
 * @author James Fisher @/02939673
 * @since 2021-09-16
 */
public class Library { 
    public List<Book> bookList = new ArrayList<Book>();// Create list for books
    public String address;// Declare variable for library addresses
    public Book name;// Declare variable for book name 
    /**
     * @param book stores names of book names which are added to bookList
     */
    public void addBook(Book book){// Add book to list
        bookList.add(book);
    }
    /**
     * Prints out the libraries hours
     */
    public void printOpeningHours(){
        System.out.println("Libraries are open daily from 9am to 5pm.");
    }
    /**
     * Prints out the libraries' addresses
     */
    public void printAddress(){
        System.out.println(address);
    }
    /**
     * Checks if a book was borrowed or not. Borrowing a book is removing it from bookList 
     * If not borrowed, print "You successfully borrowed {bookName}" message.
     * If borrowed, print "Sorry, this book is already borrowed."
     * If its neither borrowed nor not borrowed, print "Sorry, this book is not in our catalog."
     * @param bookName holds value of book title 
     */
    public void borrowBook(String bookName){
    	String availability = "Sorry, this book is not in our catalog.";// Book is not in library
        for (int i=0; i<bookList.size(); i++) {//Loop through list
        	Book bookIndex = bookList.get(i); 
        	if (bookIndex.getTitle() == bookName){// See if given title is in bookName
        		if (bookIndex.isBorrowed() == false) {// If book is not borrowed
        			bookIndex.borrowed();// Mark book as borrowed
        			availability = "You successfully borrowed " + bookName;
        		}else if (bookIndex.isBorrowed() == true){// If book is borrowed
        			availability = "Sorry, this book is already borrowed";
        		}
        	}
        }
        System.out.println(availability);
    }
    /**
     * Returns a book by adding it back to bookList
     * @param bookName holds value of book title
     */
    public void returnBook(String bookName){
        for (int i=0; i<bookList.size(); i++){// Loop through list
        	Book bookIndex = bookList.get(i);
        	if (bookIndex.getTitle() == bookName){// If title is in list
        		bookIndex.returned();// Mark book as returned
        		System.out.println("You successfully returned " + bookName);
        }
     }
   }
    /**
     * Prints the books that are currently in bookList
     * If books are borrowed, they are not in book list.
     */
    public void printAvailableBooks(){
    	if (bookList.size() == 0) {// If book list is empty
    		System.out.println("No book in catalog");
    	}
        for (int i=0; i<bookList.size(); i++){// Loop through list
        	Book bookIndex = bookList.get(i);
        	if (bookIndex.isBorrowed() == false) {// If book is not borrowed 
        		System.out.println(bookIndex.getTitle());// Print the available book
        	}

        }
    }
    /**
     * @param address holds string for the library address
     */
    public Library(String address) {// Changed this from 'title' to 'address' since an address is passed in when creating the libraries
        this.address = address;
    }

    /**
     * Prints out & runs all of the methods in the Book & Library classes
     * @param args
     */
    public static void main(String[] args) { 
    // Create two libraries 
    Library firstLibrary = new Library("10 Main St."); 
    Library secondLibrary = new Library("228 Liberty St."); 

    // Add four books to the first library 
    firstLibrary.addBook(new Book("The Da Vinci Code")); firstLibrary.addBook(new Book("Le Petit Prince")); 
    firstLibrary.addBook(new Book("A Tale of Two Cities")); firstLibrary.addBook(new Book("The Lord of the Rings")); 
    
    // Print opening hours and the addresses 
    System.out.println("Library hours:");
    firstLibrary.printOpeningHours(); 
    System.out.println(); 
    System.out.println("Library 1 address:"); 
    firstLibrary.printAddress(); 
 
    System.out.println(); 
    System.out.println("Library 2 addresses:"); 
    secondLibrary.printAddress(); 
    System.out.println(); 
    
    // Try to borrow The Lords of the Rings from both libraries 
    System.out.println("Borrowing The Lord of the Rings:"); 
    firstLibrary.borrowBook("The Lord of the Rings"); 
    firstLibrary.borrowBook("The Lord of the Rings"); 
    secondLibrary.borrowBook("The Lord of the Rings"); 
    System.out.println(); 
    
    // Print the titles of all available books from both libraries 
    System.out.println("Books available in the first library:"); 
    firstLibrary.printAvailableBooks(); 
    System.out.println(); 
    System.out.println("Books available in the second library:"); 
    secondLibrary.printAvailableBooks(); 
    System.out.println(); 
    
    // Return The Lords of the Rings to the first library 
    System.out.println("Returning The Lord of the Rings:"); 
    firstLibrary.returnBook("The Lord of the Rings"); 
    System.out.println(); 
    System.out.println("Books available in the first library:"); 
    firstLibrary.printAvailableBooks(); 
            } 
    }