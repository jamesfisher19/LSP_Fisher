package org.howard.edu.lsp.assignment4.exception;
/**
 * Creates Integer Exception for case in which lists are empty
 * @author jamesfisher
 *
 */
public class IntegerSetException extends Exception {
    public IntegerSetException (String str)  
    {  
        super(str);  
    } 
}