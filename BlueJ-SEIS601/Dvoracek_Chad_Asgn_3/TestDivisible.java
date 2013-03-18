
/**
 * Write a description of class TestDivisible here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestDivisible
{
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
