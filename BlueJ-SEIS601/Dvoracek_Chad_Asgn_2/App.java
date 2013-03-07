
/**
 * Write a description of class App here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //declare variables

        int castnum,
        castnum2,
        random1,
        random2,
        testnum;

       
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
        random1=0;
        random2=0;

        for (testnum=1; testnum<8; testnum++)
        {
            switch (testnum){
                case 1:
                random1=-1;
                random2=4;
                break;
                case 2:
                random1=0;
                random2=4;
                break;    
                case 3:
                random1=6;
                random2=57;
                break;
                case 4:
                random1=0;
                random2=3;
                break;
                case 5:
                random1=119;
                random2=-37;
                break;
                case 6:
                random1=-4;
                random2=-3;
                break;
                case 7:
                random1=-202;
                random2=0;
                break;
            }
            NumberFun numFun3 = new NumberFun();
            numFun3.hasSameEvenOddStatus(random1,random2); 
        }

        //random1=0 + (int)(Math.random() * ((100 - 0) + 1));
        //random2=0 + (int)(Math.random() * ((100 - 0) + 1));

        
    }
}
