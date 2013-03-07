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
        
    int castnum,
        castnum2,
        random1,
        random2;
    
   
       
    /** Deliverables A
     *  Provide a value for the method NumberFun and test
     *  if the number is odd.
     */
    
        for (castnum=0; castnum<2; castnum++)
        { 
            NumberFun numFun = new NumberFun();
            boolean numberChoice = numFun.isNumberOdd(castnum);

                //test castnum value
                //System.out.println(castnum);
   
                //test numberChoice value
                //System.out.println (numberChoice);
        
        
        
        System.out.println("isNumberOdd is "+numberChoice+" for the number "+castnum);
    
        }
        System.out.println ("\r");
        
        
    /** Deliverables B
     *  Provide a value for the method NumberFun and test
     *  if the number is odd.
     */
        
        
        for (castnum=0; castnum<2; castnum++)
        { 
            NumberFun numFun2= new NumberFun();
            boolean numberChoice2 = numFun2.isNumberEven(castnum);

                //test castnum value
                //System.out.println(castnum);
   
                //test numberChoice value
                //System.out.println (numberChoice2);
        
        System.out.println("isNumberEven is "+numberChoice2+" for the number "+castnum); 
        }
        System.out.println("\r");
        
    /** Deliverables C
     *  Provide a value for the method NumberFun hasSameEvenOddStatus and test
     *  if the number even and if both numbers are either even, odd, or both.
     * 
     *  I thought it would be fun to have the last part generate random numbers
     *  for the input that would allow the testing of the different statements.
     *  I found the following formula on the internet at:
     *  http://stackoverflow.com/questions/363681/generating-random-number-in-a-range-with-java
     */
       
        
        random1=0 + (int)(Math.random() * ((100 - 0) + 1));
        random2=0 + (int)(Math.random() * ((100 - 0) + 1));
        NumberFun numFun3 = new NumberFun();
        numFun3.hasSameEvenOddStatus(random1,random2);
        
        
}
}
