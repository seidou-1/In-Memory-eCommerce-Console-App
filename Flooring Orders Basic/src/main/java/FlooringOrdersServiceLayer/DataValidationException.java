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
public class DataValidationException extends Exception {
    
    public DataValidationException (String message){
        
        super (message);
    }
    
    public DataValidationException (String message, Throwable cause) {
        
        super (message, cause);
                
    }
    
}
