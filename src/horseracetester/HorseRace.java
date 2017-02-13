
package horseracetester;
//importing the ArrayList
import java.util.ArrayList;
public class HorseRace
{//start of the 'HorseRace' class
    
    //declaring an array list called 'participants' of type 'Horse'
    ArrayList<Horse> participants = new ArrayList<>();
    final static int constant = 250;//declaring a constant
    int newPosition = 0;//variable to store the new position of the horse
    
    /*creating a constructor of the 'HorseRace' class which takes the
    number of horses participating in the race as an argument. Then it
    adds the horses to the array list and initializes their current position
    to zero.*/
    public HorseRace(int total)
    {//start of the constructor
        
        /*This for loop  adds the horses to the array list and initializes 
        their current position to zero.*/
        for(int i = 0;i < total;i++)
        {//start of the for loop
      participants.add(new Horse("Horse "+(i+1), i, 0));
        }//start of the for loop
        
    }//end of the constructor
    
    /*This method prints the position of horses*/
   public String displayHorsePosition()
    {//start of the method
        return "Horse "+getCurrentHorse()+star()+" >Finish";  
    }//end of the method
   
   //This method returns the printed positions of the horses.
   public String star()
   {//start of the method
       String str="";
       //This for loop gives the printed positions of the horses.
      for(int i=0;i <  participants.get(Horse.number-1).currentPosition; i++)
      {//start of the for loop
         str = str + "*";
      }//end of the for loop
      return str;
   }//end of the method
    
   //This method returns the number of the current horse
    public int getCurrentHorse()
    {//start of the method
        return Horse.number;
    }//end of the method
    
    /*This method sets the new position of the horse by calling the
    positionMoved() method of the Die class. It also checks whether the 
    two numbers rolled on the dice are equal. If they are equal, then
    the dice is rolled again*/
    public void setNewPosition()
    {//start of the method
        newPosition = 0;
        int move = Die.positionMoved();
        newPosition = newPosition + move;
       
        /*The while loop checks if the two numbers rolled on the dice are
        equal by calling the 'isDoubles()' method. If they are equal then
        the dice is rolled again*/
        while(true)
        {//start of the while loop
            boolean flag = isDoubles();
            if(flag == true)
            {
            System.out.println("Again roll the dice");
            newPosition = newPosition + Die.positionMoved();
            }
            else
                break;//terminating the loop
        } //end of the while loop
    }//end of the method
    
    /*This method stores the new value of the horse's current position
    in the array list and returns that new value*/
    public int position()
    {//start of the method
  
     //variable to store the current position of the horse
     int k = participants.get(Horse.number-1).currentPosition;
     System.out.println(" Horse number "+Horse.number);
     System.out.println("Current position: "+k);
     //storing the new value of the current position in the array list
     participants.add((Horse.number)-1, new Horse(Horse.name, Horse.number,
             k+newPosition));
     participants.remove(Horse.number);
     //printing the new position of the horse after rolling the dice
     System.out.println("New position of the horse is: " +
             participants.get((Horse.number)-1).currentPosition);
     //returning the new position.
     return participants.get((Horse.number)-1).currentPosition;
    }//end of the method
    
    /*This method returns true if the two numbers rolled are equal else
        it returns false*/
    public boolean isDoubles()
    {//start of the method
        return Die.p1 == Die.p2;
    }//end of the method
}//end of the 'HorseRace' class
