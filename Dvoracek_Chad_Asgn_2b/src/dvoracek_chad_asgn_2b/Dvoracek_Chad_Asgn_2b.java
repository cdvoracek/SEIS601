/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dvoracek_chad_asgn_2b;

/**
 *
 * @author Chad
 */
public class Dvoracek_Chad_Asgn_2b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    //declare variables
        
    int castnum;
    
   
       
    /** Deliverable A
     *  Provide a value for the method NumberFun and test
     *  if the number is odd or even.
     */
    
        for (castnum=0; castnum<2; castnum++)
        { NumberFun numFun = new NumberFun();
  
        boolean numberChoice = numFun.isNumberOdd(castnum);

                //test castnum value
                //System.out.println(castnum);
   
                //test numberChoice value
                //System.out.println (numberChoice);
        
        System.out.println(castnum+" is the number and NumberFun isNumberOdd() returns: "+ numberChoice);
       
        }
        
      /** Deliverable B
       * 
       * 
       */

    }
}

