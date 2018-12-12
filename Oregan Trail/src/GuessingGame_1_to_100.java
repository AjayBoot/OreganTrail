import java.util.*;

public class GuessingGame_1_to_100
{
    public static int Start_Game()
    {
        Scanner input = new Scanner(System.in);
        
        int x;
        char y;
        String z;
        
        System.out.println("Welcome to this guessing game.");
        
        System.out.println("Please pick a whole number from 1 to 100. If you guess correctly within 6 tries, you win! If you don't you lose.");
        
        int correctnumber = (int)(Math.random() * 99 + 1);
        int numberofguesses = 0;
        int guess = 0;
        
        while (guess != correctnumber && numberofguesses < 6)
        {
            guess = input.nextInt();
            if (guess > correctnumber)
            {
                if (guess > 100)
                {
                    System.out.println("Sorry. Your number is invalid. Please pick another number that is between 1 and 100.");
                }
                else
                {
                    System.out.println("Your guess is too big! Try again!");
                }
            }
            if (guess < correctnumber)
            {
                if (guess < 1)
                {
                    System.out.println("Sorry. Your number is invalid. Please pick another number that is between 1 and 100.");
                }
                else
                {
                    System.out.println("Your guess is too small! Try again!");
                }
            }
            numberofguesses++;
            System.out.println("You have " + (6 - numberofguesses) + " tr(y/ies) left.");
            if (numberofguesses == 6)
            {
                System.out.println("You loose. The correct number was " + correctnumber + ".");
            }
        }
        
        if (guess == correctnumber)
        {
            System.out.println("Congratulations! You got it.");
            System.out.println("You guessed " + numberofguesses + " times.");
            if (numberofguesses == 1)
            {
                System.out.print("Your score is magnificent!");
            }
            else
            {
                if (numberofguesses == 2)
                {
                    System.out.print("Your score is amazing!");
                }
                else
                {
                    if (numberofguesses == 3 || numberofguesses == 4)
                    {
                        System.out.print("Your score is good.");
                    }
                    else
                    {
                        if (numberofguesses >= 5 && numberofguesses <=7)
                        {
                            System.out.print("Your score is average.");
                        }
                        else
                        {
                            if (numberofguesses == 8 || numberofguesses == 9)
                            {
                                System.out.print("Your score is poor.");
                            }
                            else
                            {
                                System.out.print("Your score is yucky!");
                            }
                        }
                    }
                }
            }
        }
        return numberofguesses; 
    }
}

