/*

Hamilton Nguyen 1000538439 07/26/2018
problem 2
 */
import java.util.Random;
import java.util.Scanner;

public class guessinggame {

    /*Create a method called numGenerate() that randomly generates a number to guess. This
method takes an int parameter that serves as a bound (meaning the randomly generated
number should not be larger than this bound) and returns the randomly generated
number*/
    
    public static int numGenerate(int n)
    {
        int max = n;
        int min = 1;
        Random randomNum = new Random();
        int numToGuess = min + randomNum.nextInt(max);
        return numToGuess;
    }
    
/*Create a method called getUserInput(). This method should take a String message that
serves as a prompt for the user. The method should return an int that was input by the
user.*/
    
    public static int getUserInput(String message)
    {
        Scanner in=new Scanner(System.in);
        System.out.println(message);
        
        int n = in.nextInt();

        return n;
        
    }
/*Create a method called compareGuess(). This method should take two int parametersone
should be the user’s guess and the other should be the number the user is trying to
guess. The method should return a boolean depending on whether or not the user’s guess
matches the goal number to be guessed.*/
    
     public static boolean compareGuess(int useNumber, int numToGuess)
    {
        if(useNumber==numToGuess)
        {
            return false;
        }
        
        else
        {
            return true;
        }
    }
    
/*Create a method called finalMessage(). This method should take a boolean and an int
parameter (this int parameter should represent the number to be guessed). The method
simply prints out whether the user won or lost the game and states what the goal number
was after. Hint: the boolean parameter determines whether or not the game was won.*/
     
      public static void finalMessage(boolean choice, int numToGuess)
    {
        if(choice==false)
        {
            System.out.printf("Yes, the number is %d! You win!\n", numToGuess);
        }
        
        else
        {
            System.out.printf("You lost. The number was %d.\n", numToGuess);
        }
    }
   
    public static void main(String[] args) {
   
System.out.println("Welcome to the guessing game!");
System.out.println("You have 3 guesses!");
int n=getUserInput("Enter the largest number possible to guess (remember, if you want 5 to be the largest enter one larger-6)");
int numToGuess=numGenerate(n);
int i=0;
boolean choice=true;
while(i<3 && choice)
{
int userNumber=getUserInput("Enter your guess:");
choice=compareGuess(userNumber, numToGuess);
i++;
}
finalMessage(choice, numToGuess);
    }
    
}