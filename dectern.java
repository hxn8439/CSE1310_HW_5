/*
 Hamilton Nguyen 1000538439 07/26/2018
problem 3
 */
import java.util.Scanner;

public class dectern {
    
    public static String getUserInput(String message){
    Scanner in=new Scanner(System.in);
    System.out.println(message);
    String Which=in.nextLine();
            
    return Which;
    
    }

 public static String base10to3(String Message)
    {
        System.out.println(Message);        
        Scanner in=new Scanner(System.in);
        int input= in.nextInt();
        String output = Integer.toString(input, 3);
        
        return output;
    }
    
    public static int base3to10(String Message)
    {
        System.out.println(Message);
        Scanner in=new Scanner(System.in);
        int input = in.nextInt();
        String output = Integer.toString(input);
        String [] numbers =output.split("");
        int Summation = 0;
        int j=numbers.length;
        
        
        for(int i=0;i<numbers.length;i++)
        {
            j--;
            int StToNum = Integer.parseInt(numbers[i]);
            int conv = (int)Math.pow(3, j);
            int Newnum = conv*StToNum; 
            Summation = Summation+Newnum;
        }
		
        return Summation;
    }    
    
    public static void main(String[] args) {
        
     boolean initiate =true;
     
     while(initiate ==true)
     {   
     String Which =getUserInput("Press 1 to convert from Base 10 to Base 3.\nPress 2 to convert from Base 3 to Base 10.\nEnter the word 'exit' to end the program.");
     String Message = ("\nEnter your number to convert:");
     if(Which.equals("1"))
     {

         String answer = base10to3(Message);
         System.out.println("Base 3: "+answer);
         System.out.println("");
     }
     if(Which.equals("2"))
     {
         int summation = base3to10(Message);
         System.out.println("Base 10: "+summation);
         System.out.println("");
     }
     if(Which.equals("exit"))
     {
         return;
     }
     }    
    }
    
}