import java.util.*;

public class TicTacToe
{
    public static int Start_Game()
    {
        Scanner reader = new Scanner (System.in);
        
        String [][] table = new String [4][4];
        
        System.out.println("Welcome to Easy Mode Tic-Tac-Toe!");
        
        int r, c;
        
        System.out.println();
        
        for (c = 1; c < 4; c++)
        {
            for (r = 1; r < 4; r++)
            {
                table [r][c] = "-";
                System.out.print(table [r][c]);
            }
            System.out.println();
        }
        
        int a = 2;
        int b = 2;
        int win = 0;
        int result = 0;
        
        while ((table [a-1][b-1] == "-" || table [a-1][b] == "-" || table [a-1][b+1] == "-" || table [a][b-1] == "-" || table [a][b] == "-" || table [a][b+1] == "-" || table [a+1][b-1] == "-" || table [a+1][b] == "-" || table [a+1][b+1] == "-") && (win == 0))
        {
            if (table [a-1][b-1] == "-" || table [a-1][b] == "-" || table [a-1][b+1] == "-" || table [a][b-1] == "-" || table [a][b] == "-" || table [a][b+1] == "-" || table [a+1][b-1] == "-" || table [a+1][b] == "-" || table [a+1][b+1] == "-")
            {
                System.out.println("Input 2 numbers between 1 and 3, the first representing the column, the second representing the row, to choose your spot. You will be X, I will be O.");
                
                int inputR = reader.nextInt();
                int inputC = reader.nextInt();
            
                while(inputR > 3 || inputR < 1 || inputC > 3 || inputC < 1)
                {
                    System.out.println("Sorry, you inputted an invalid number. Please pick 2 numbers between 1 and 3.");
                    inputR = reader.nextInt();
                    inputC = reader.nextInt();
                }
                
                table [inputR][inputC] = "X";
                
                System.out.println();
                
                for (c = 1; c < 4; c++)
                {
                    for (r = 1; r < 4; r++)
                    {
                        System.out.print(table [r][c]);
                    }
                    System.out.println();
                }
                
                System.out.println();
                
                if ((table [1][1] == "X" && table [1][2] == "X" && table [1][3] == "X") || (table [2][1] == "X" && table [2][2] == "X" && table [2][3] == "X") || (table [3][1] == "X" && table [3][2] == "X" && table [3][3] == "X") || (table [1][1] == "X" && table [2][1] == "X" && table [3][1] == "X") || (table [1][2] == "X" && table [2][2] == "X" && table [3][2] == "X") || (table [1][3] == "X" && table [2][3] == "X" && table [3][3] == "X") || (table [1][1] == "X" && table [2][2] == "X" && table [3][3] == "X") || (table [3][1] == "X" && table [2][2] == "X" && table [1][3] == "X"))
                {
                    System.out.println("You win!");
                    win = 1;
                    result = 1;
                }
            }
            
            if (win == 0)
            {
            if (table [a-1][b-1] == "-" || table [a-1][b] == "-" || table [a-1][b+1] == "-" || table [a][b-1] == "-" || table [a][b] == "-" || table [a][b+1] == "-" || table [a+1][b-1] == "-" || table [a+1][b] == "-" || table [a+1][b+1] == "-")
            {
                int gR = (int)(Math.random() * 3 + 1);
                int gC = (int)(Math.random() * 3 + 1);
                
                while (!table [gR][gC].equals("-"))
                {
                    gR = (int)(Math.random() * 3 + 1);
                    gC = (int)(Math.random() * 3 + 1);
                }
                
                table [gR][gC] = "O";
                
                System.out.println("It's my turn.");
                System.out.println();
                
                for (c = 1; c < 4; c++)
                {
                    for (r = 1; r < 4; r++)
                    {
                        System.out.print(table [r][c]);
                    }
                    System.out.println();
                }
                
                System.out.println();
                
                if ((table [1][1] == "O" && table [1][2] == "O" && table [1][3] == "O") || (table [2][1] == "O" && table [2][2] == "O" && table [2][3] == "O") || (table [3][1] == "O" && table [3][2] == "O" && table [3][3] == "O") || (table [1][1] == "O" && table [2][1] == "O" && table [3][1] == "O") || (table [1][2] == "O" && table [2][2] == "O" && table [3][2] == "O") || (table [1][3] == "O" && table [2][3] == "O" && table [3][3] == "O") || (table [1][1] == "O" && table [2][2] == "O" && table [3][3] == "O") || (table [3][1] == "O" && table [2][2] == "O" && table [1][3] == "O"))
                {
                    System.out.println("You lose.");
                    win = 1;
                    result = 0;
                }
            }
            }
            
            if ((table [a-1][b-1] != "-" && table [a-1][b] != "-" && table [a-1][b+1] != "-" && table [a][b-1] != "-" && table [a][b] != "-" && table [a][b+1] != "-" && table [a+1][b-1] != "-" && table [a+1][b] != "-" && table [a+1][b+1] != "-") && win == 0)
            {
                System.out.println("We tied.");
                result = 2;
            }
        }
        return result; 
    }
}


