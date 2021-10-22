package org.howard.edu.lsp.assignment5.integerset;
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