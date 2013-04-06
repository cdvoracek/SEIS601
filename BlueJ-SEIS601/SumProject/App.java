
/**
 * Main App for SumProject.
 * 
 * @author Chad Dvoracek 
 * @version 20130404 19:32
 */
public class App
{
    public static void main(String[] args) 
    throws Exception
    {

                
        SumFun  sf = new SumFun();
        int total;
        total = sf.Sum(1, 100);
        
        SumFun sf2 = new SumFun();
        int total2;
        total2 = sf2.Sum(-100, 10);
    

        System.out.println ("sum (1,100)= "+total);
        System.out.println ("sum (-100,10)= "+total2);

    }
}
