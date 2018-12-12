import java.util.*;

public class RockPaperScissors
{
    public static int Start_Game()
    {
        Scanner reader = new Scanner (System.in);
        
        System.out.println("Welcome to Rock-Paper-Scissors.");
        
        int temp = 0;
        int num = 0;
        int result = 0; 
        
        while (temp == num)
        {
            System.out.println("Enter either Rock, Paper, or Scissors and try to beat me.");
            
            String input = reader.nextLine();
            
            temp = (int)(Math.random() * 3 + 1);
            
            if (input.equals("Rock"))
            {
                num = 1;
            }
            if (input.equals("Paper"))
            {
                num = 2;
            }
            if (input.equals("Scissors"))
            {
                num = 3;
            }
            
            String a = "";
            
            if (temp == num)
            {
                if (temp == 1)
                {
                    a = "Rock";
                }
                if (temp == 2)
                {
                   a = "Paper";
                }
                if (temp == 3)
                {
                    a = "Scissors";
                }
                System.out.println("We both picked " + a + ". Let's go again.");
            }
        }
        
        if (num == 3 && temp == 2)
        {
            System.out.println("I picked Paper. Scissors beats Paper. You win.");
            result = 1;
        }
        if (num == 2 && temp == 3)
        {
            System.out.println("I picked Scissors. Scissors beats Paper. You lose.");
            result = 0;
        }
        
        if (num == 2 && temp == 1)
        {
            System.out.println("I picked Rock. Paper beats Rock. You win.");
            result =1;
        }
        if (num == 1 && temp == 2)
        {
            System.out.println("I picked Paper. Paper beats Rock. You lose.");
            result = 0;
        }
        
        if (num == 1 && temp == 3)
        {
            System.out.println("I picked Scissors. Rock beats Scissors. You win.");
            result = 1;
        }
        if (num == 3 && temp == 1)
        {
            System.out.println("I picked Rock. Rock beats Scissors. You lose.");
            result = 0;
        }
        return result; 
    }
}


