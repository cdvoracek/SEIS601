/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dvoracek_chad_asgn_3nb;

/**
 *
 * @author Chad
 */
public class TestDivisible {


boolean divByThree (int numdiv)
    { if (numdiv%3==0) 
         {
          return true;
         }
    else {
          return false;         
         }
    }
   
boolean divByFive (int numdiv)
    { if (numdiv%5==0) 
         {
          return true;
         }
    else {
          return false;
         }
    }
boolean divBySeven (int numdiv)
    { if (numdiv%7==0) 
         {
           return true;    
         }
    else {
          return false;
         }
    }

boolean notByAny (int numdiv)
    {if (numdiv%3!=0 && numdiv%5!=0 && numdiv%7!=0) {return true;}
    
    else {return false;}  
    
    }
    
}
