
/**
 * Write a description of class NumberFun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class NumberFun 
{

    //Assign Variables
    boolean num1status, num2status;
    boolean isNumberOdd(int num)
    {       
        if (num%2==0){return false;} 	
        else {return true;}
    }

    boolean isNumberEven(int num)
    {   if (num%2==0) {return true;}
        else {return false;}
    }

    public void hasSameEvenOddStatus(int num1,int num2)
    {

        boolean num1status, 
        num2status;

        String declare1, 
        declare2, 
        compareboth;

        if (num1 % 2==0){num1status = true; declare1="even";}
        else {num1status = false; declare1="odd";}

        if (num2 % 2==0) {num2status = true; declare2="even";}
        else {num2status = false; declare2="odd";}

        if (num1status == num2status){compareboth = "hasSameEvenOddStatus=True. Both numbers ("+num1+" & "+num2+") are "+declare1+".";}
        else {compareboth = "hasSameEvenOddStatus=False. The first number ("+num1+") is "+declare1+" and the second number ("+num2+") is "+declare2+".";}

        System.out.println (num1+" is "+declare1);
        System.out.println (num2+" is "+declare2);
        System.out.println (compareboth);
        System.out.println ("\r");
        
    }
}

