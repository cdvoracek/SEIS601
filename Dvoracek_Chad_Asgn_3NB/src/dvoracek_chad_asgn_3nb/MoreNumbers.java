/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dvoracek_chad_asgn_3nb;

/**
 *
 * @author Chad
 */
public class MoreNumbers {

//Assign Variables


    
//Deliverable A Method   
public static void check357(int num)
{
//is number divisible by 3, 5, 7


TestDivisible testDiv = new TestDivisible();
boolean div3 = testDiv.divByThree(num);
    if (div3) 
    {
        System.out.println("The number ("+num+ ") is divisible by 3");
    }
TestDivisible testDiv2 = new TestDivisible();
boolean div5 = testDiv2.divByFive(num);
    if (div5) 
    {
        System.out.println("The number ("+num+ ") is divisible by 5");
    
    }
         
TestDivisible testDiv3 = new TestDivisible();
boolean div7 = testDiv3.divBySeven(num);
    if (div7) 
    {
        System.out.println("The number ("+num+ ") is divisible by 7");
    
    }

TestDivisible testDiv4 = new TestDivisible();
boolean divnot = testDiv4.notByAny(num);
    if (divnot) 
    {
        System.out.println("The number ("+num+ ") is not divisible by 3,5, or 7.");
        System.out.println ("\r");
    }
    else 
    {
        System.out.println ("\r");
    }

         


}
 
//Deliverable B Method
/** Check is num is divisible by 3, 5, 7, or any combination of these three
 *  divisors.
 */

public static void checkRange(int start, int end)
{
int testnum;
for (testnum=start; testnum<=end; testnum++)
{    
TestOddEven cr1 = new TestOddEven();
boolean testingPart1 = cr1.testEven(testnum);
    if (testingPart1)
        {
        System.out.println ("The number ("+testnum+") is even.");
        }
    else {System.out.println ("The number ("+testnum+") is odd.");
}
MoreNumbers.check357(testnum);

}




}
}
