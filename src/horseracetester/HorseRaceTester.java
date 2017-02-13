
package horseracetester;

import java.util.*;
public class HorseRaceTester 
{//start of the 'HorseRaceTester' class
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {//start of the main method
        //creating an object of the Scanner class.
       Scanner sc = new Scanner(System.in);
       /*Prompting the user to enter the number of horses that will play
        the game and storing the value in a variable called 'total'*/
       System.out.println("How many horses will play the game?");
       int total = sc.nextInt();
       //creating an object of the 'HorseRace' class.
       HorseRace ob = new HorseRace(total);
       //creating an object of the Horse class.
       String output;
       /*calculating the current time in milli seconds which is stored as the
       'startTime'*/
       double startTime = System.currentTimeMillis();
       /*This while loop runs only if the value of the currentPosition
       variable is less than the maximum number of positions i.e. 250*/
       int pos=0;
       while(pos < HorseRace.constant)
       {//start of the while loop
           pos=0;
          output="";
       /*This for loop calls the setNewPosition() and the displayHorsePosition()
           methods and then gives the result when the currentPosition exceeds
           or becomes equal to the constant, 250*/
        
       for(int i=0;i<total;i++)
       {//start of the for loop
       Horse.number = i+1;
       /*calling the setNewPosition(), position() and displayHorsePosition()
       methods*/
       ob.setNewPosition();
       pos = ob.position();
       String str = ob.displayHorsePosition();
       /*checking if the value of the currentPosition variable is equal to or
       greater than the constant*/
       if(pos >=HorseRace.constant)
       {
          System.out.println(ob.getCurrentHorse()+" has won!!");
          break;
       }
        output = output+"\n" + str;
       }//end of the for loop
       System.out.println("Game Board "+"\n"+"-----------------");
       System.out.println(output);
       }//end of the while loop
       
       /*calculating the current time in milli seconds which is stored 
       as the 'endTime'*/
       double endTime = System.currentTimeMillis();
       //calculating the total time in seconds, taken to complete the race 
       double totalTime = (endTime - startTime)/1000;
       //printing the total time in seconds
       System.out.println("Time taken to win "+totalTime+" seconds");
    }//end of the main method
}//end of the 'HorseRaceTester' class
