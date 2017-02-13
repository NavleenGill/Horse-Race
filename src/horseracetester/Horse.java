
package horseracetester;

public class Horse
{//start of the 'Horse' class
    
    /*declaring variables to store the name, number and currentPosition
    of the horses*/
    static String name;
    static int number;
    int currentPosition;
     
     public Horse()
     {
         name="";
         number=0;
         currentPosition=0;
     }
    
    /*creating a parameterized constructor which assigns values to the
    class variables (name, number and currentPosition)*/
    public Horse(String name, int number, int currentPosition)
    {//start of the constructor
        Horse.name = name;
        Horse.number = number;
        this.currentPosition = currentPosition;
    }//end of the constructor
    
    //This method sets the name of the horse
    public void setName(String name)
    {//start of the method
       Horse.name = name;
    }//end of the method
    
    //This method sets the number of the horse
    public void setNumber(int number)
    {//start of the method
        Horse.number = number;
    }//end of the method
    
    //This method sets the current position of the horse
    public  void setCurrentPosition(int currentPosition1)
    {//start of the method
        currentPosition = currentPosition1;
    }//end of the method
    
    //This method returns the name of the horse
    public String getName()
    {//start of the method
        return name;
    }//end of the method
    
    //This method returns the number of the horse
    public int getNumber()
    {//start of the method
        return number;
    }//end of the method
    
    //This method returns the current position of the horse
    public int getCurrentPosition()
    {//start of the method
        return currentPosition;
    }//end of the method  
}//end of the 'Horse' class
