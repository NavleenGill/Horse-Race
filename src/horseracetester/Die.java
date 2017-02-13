
package horseracetester;

public class Die 
{//start of the 'Die' class
    //declaring varibales to store the two random numbers generated
    static int p1;
    static int p2;
    
    /*This method calls the 'randomRoll()' method which
    generates two random numbers. Those two numbers are then added to
    determine how many moves a horse will make and the moves made are
    returned by this method*/
    public static int positionMoved()
    {//start of the 'positionMoved()' method
         p1 = randomRoll();
         p2 = randomRoll();
         System.out.println("The numbers rolled are "+p1 +" "+p2);
        
        int totalPositionMoved = p1 + p2;
        System.out.println("Moves made "+ totalPositionMoved);

        return  totalPositionMoved;
    }//end of the 'positionMoved()' method
    
    /*This method generates a random number between 0 and 6 and then returns 
    that number.*/
    public static int randomRoll()
    {//start of the 'randomRoll()' method
        int roll = (int)(Math.random()*6);
        return roll;
    }//end of the 'randomRoll()' method   
}//end of the 'Die' class
