import java.util.Scanner;

public class TheGameOfNim
{
    public static int Start_Game()
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Hi! Welcome to The Game of Nim.");
        System.out.println("Nim is an ancient game that is thought to have originated in China.\nThe game is played by two players.\nThe game begins when 26 sticks are placed on a table.\nThe players take turns taking 1, 2, or 3 sticks per turn.\nThe person that takes the last stick wins.\n");
        
        System.out.println("Who goes first? Enter a different number from 1 to 10. Whoever gets the closest to the random number generated will go first.");
        
        int znumber = input.nextInt();
        
        int correctnumber = (int)(Math.random() * 9 + 1);
        int compguess = (int)(Math.random() * 9 + 1);
        int sticks = 26;
        int nosticks;
        int result = 0;
        System.out.println("I pick " + compguess + ".");
        
        while (Math.abs(correctnumber - znumber) == Math.abs(correctnumber - compguess))
        {
            System.out.println("Our guesses were the same amount from the actual number " + correctnumber + ". Please guess different number.");
            correctnumber = (int)(Math.random() * 9 + 1);
            compguess = (int)(Math.random() * 9 + 1);
            System.out.println("Please enter a number from 1 to 10.");
            znumber = input.nextInt();
            System.out.println("I pick " + compguess + ".");
        }
        if (Math.abs(correctnumber - znumber) < Math.abs(correctnumber - compguess))
        {
            System.out.println("You will go first since your guess was closer to the random number " + correctnumber + ".");
        }
        else
        {
            System.out.println("I will go first since my guess was closer to the random number " + correctnumber + ".");
        }
        
        while (sticks > 0)
        {
            if (Math.abs(correctnumber - znumber) < Math.abs(correctnumber - compguess))
            {
                if (sticks > 0)
                {
                    System.out.println("Please choose a number between 1 to 3 to determine how many sticks you would like to pick up.");
                    nosticks = input.nextInt();
                    while(nosticks > 3 || nosticks < 1)
                    {
                        System.out.println("Sorry, that is an invalid number. Please pick a number between 1 and 3.");
                        nosticks = input.nextInt();
                    }
                    sticks = sticks - nosticks;
                    System.out.println("There are " + sticks + " remaining.");
                    if (sticks <= 0)
                    {
                        System.out.println("Congragulations, you win!");
                        result = 1;
                    }
                }
                if (sticks > 0)
                {
                    if (sticks > 3)
                    {
                        int compsticks = (int)(Math.random() * 3 + 1);
                        System.out.println("I pick " + compsticks + " stick(s).");
                        sticks = sticks - compsticks;
                        System.out.println("There are " + sticks + " remaining.");
                    }
                    else
                    {
                        if (sticks == 1 || sticks == 2 || sticks == 3)
                        {
                            System.out.println("I pick " + sticks + " stick(s).");
                            sticks = 0;
                            if (sticks <= 0)
                            {
                                System.out.println("Looks like I win. You lose.");
                                result = 0;
                            }
                        }
                    }
                }
            }
            else
            {
                if (sticks > 0)
                {
                    if (sticks > 3)
                    {
                        int compsticks = (int)(Math.random() * 3 + 1);
                        System.out.println("I pick " + compsticks + " stick(s).");
                        sticks = sticks - compsticks;
                        System.out.println("There are " + sticks + " remaining.");
                    }
                    else
                    {
                        if (sticks == 1 || sticks == 2 || sticks == 3)
                        {
                            System.out.println("I pick " + sticks + " stick(s).");
                            sticks = 0;
                            if (sticks <= 0)
                            {
                                System.out.println("Looks like I win. You lose.");
                                result = 0;
                            }
                        }
                    }
                }
                if (sticks > 0)
                {
                    System.out.println("Please choose a number between 1 to 3 to determine how many sticks you would like to pick up.");
                    nosticks = input.nextInt();
                    while(nosticks > 3 || nosticks < 1)
                    {
                        System.out.println("Sorry, that is an invalid number. Please pick a number between 1 and 3.");
                        nosticks = input.nextInt();
                    }
                    sticks = sticks - nosticks;
                    System.out.println("There are " + sticks + " remaining.");
                    if (sticks <= 0)
                    {
                        System.out.println("Congragulations, you win!");
                        result = 1;
                    }
                }
            }
        }
        return result; 
    }
}


