/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlooringOrdersServiceLayer;

/**
 *
 * @author laptop
 */
public class InvalidDateException extends Exception{
    public InvalidDateException (String message){
        
        super (message);
    }
    
    public InvalidDateException (String message, Throwable cause) {
        
        super (message, cause);
                
    }
    
}
