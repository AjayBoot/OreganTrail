import java.util.*;
import java.awt.*;
import java.lang.Math.*;
 
public class The_Endless_Trail   {
    public static void display(int day, int gold, int food, int party, double risk, int townsDiscovered)
    {
        System.out.println("Day: " +day);
        System.out.println("Gold: " +gold);
        System.out.println("Food: " +food);
        System.out.println("People: " +party);
        System.out.println("Risk: " +risk);
        System.out.println("Towns discovered: " +townsDiscovered);
    }
    public static void Market_Display(int gold, int food, int carriageLevel, int sleepingBagLevel, int foodCapacity)
    {
        System.out.println("Gold: " +gold);
        System.out.println("Food: " +food);
        System.out.println("Food Capacity: " +foodCapacity);
        System.out.println("Carriage Level: " +carriageLevel);
        System.out.println("Sleeping Bag Level: " +sleepingBagLevel);
    }
    public static void Hotel_Options(int party, int sleepRisk)
    {
        System.out.println("The more money you are willing to pay, the better the hotel you recieve.");
        System.out.println("1. This hotel will cost "+(party*3.5)/3+" gold. It will provide you with a quarter of your food for the day, and reduce your risk by " +(sleepRisk/2)+".");
        System.out.println("2. This hotel will cost "+(party*3.5)/1.5+" gold. It will provide you with a half of your food for the day, and reduce your risk by " +(sleepRisk)+".");
        System.out.println("3. This hotel will cost "+(party*3.5)*1.2+" gold. It will provide you with your food for the day, and reduce your risk by " +(sleepRisk*2) +".");
    }
    public static void Market_Options()
    {
        System.out.println("1. Food.");
        System.out.println("2. Buy a better sleeping bag.");
        System.out.println("3. Upgrade Carriage. ");
        System.out.println("4. Leave shop.");
        System.out.println("5. What do these options do?");
    }
    public static void Travel_Options()
    {
        System.out.println("1. Continue on your journey (Increase your risk)");
        System.out.println("2. Rest (Lower your risk, Skip a day)");
        System.out.println("3. Send a scout (-1 member, - food, decreases risk for next days.");
        System.out.println("4. Kermit Sudoku");
        System.out.println("5. Adjust Speed");
        System.out.println("6. What do these options do?");
    }   
    public static void Town_Options()
    {
        System.out.println("1. Continue on your journey");
        System.out.println("2. Rest in a hotel");
        System.out.println("3. Shop");
        System.out.println("4. Eat at a restaurant");
        System.out.println("5. Go to the tavern"); 
        System.out.println("6. What do these options do?");
    }
    public static void Speed_Options()
    {
        System.out.println("1. Travel at a slow speed, causing less risk per day, but increases the amount of days to reach the next town.");
        System.out.println("2. Travel at a medium pace, causing more risk per day, but takes less days to reach the next town.");
        System.out.println("3. Travel at a fast pace, causing twice the risk, however drastically reduces the amount of days needed for the next town.");
    }
    public static void main (String[]args)
        {  
            System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n ");
            
            int food = 50;
            int gold = 100; 
            int entrance;
            int day = 1;
            double risk = 0;
            double riskIncrease = 0;
            int decision = 0; 
            int town = 1;
            double nextTown = 0;
            int townsDiscovered = 0;
            int oneMoreThanTowns = 1;
            int speedLevel = 1;
            int speed = 1;
            int carriageLevel = 1;
            int nextCarriageLevel = 2;
            int daysTraveledInARow = 0;
            int Scout = 0;
            int Scoutdays = 0;
            int Scoutfood = 0;
            int party = 2;
            int foodCapacity = 200;
            int sleepRisk = 10;
            int cost = 1;
            int sleepingBagLevel = 1;
            int nextSleepingBagLevel = 2;
            double random; 
            double minigame = 0;
            int result;
            int goal = 0; 
            Scanner Scans = new Scanner(System.in);
            
            Random Ran = new Random();
            Random Ran1 = new Random();
            
            
            System.out.println("Hello traveler! Your fate has already been determined, the question is, do you proceed?");
            System.out.println("1. Continue");
            System.out.println("2. Give up like the peasant you are.");
            entrance = Scans.nextInt();
           
            
            
            if(entrance == 2)
            {
                System.out.println("Are you sure you would like to give up like a wimp?");
                System.out.println("1. Redeem Thyself!");
                System.out.println("2. Give up like a coward.");
                entrance = Scans.nextInt();
            }
            
            System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n ");
                                
            if(entrance == 1)
            {
                System.out.println("Would you like to set an end game goal based on how many towns you discover? (Recommended: 2-8)");
                System.out.println("1. Yes.");
                System.out.println("2. No, I want to get as far as I can.");
                decision = Scans.nextInt();
                if(decision == 1)
                {
                    System.out.println("What goal would you like to set?");
                    goal = Scans.nextInt();
                }
                
                System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n ");
                
                System.out.println(" Welcome to the beginning of your journey, traveler. Go onwards and meet your fate.");
                System.out.println("The distance between each town scales with the amount of days that have past.");
                System.out.println("\n \n");
            }
            while(entrance == 1)
            {
               display(day, gold, food, party, risk,townsDiscovered);    
               System.out.println("\n\n");
               if(sleepingBagLevel == nextSleepingBagLevel)
               {
                   sleepRisk += 10;
                   nextSleepingBagLevel ++;
               }
               if(carriageLevel == nextCarriageLevel)
               {
                    speed += speed * 1.15;
                    foodCapacity += 100;
                    nextCarriageLevel++;
               }
               if(town == 0)
               { 
                    decision = 0;
                    if(risk>0&&risk<250)
                    {
                         minigame = (double)(Math.random()*risk) + 1;
                         if(minigame<risk/8)
                         {
                             result = TicTacToe.Start_Game();
                             if(result == 0)
                             {
                                 System.out.println("\n");
                                 System.out.println("For loosing, you will be penalized " +party +" food!");
                                 food = food - party; 
                                 System.out.println("\n\n");
                             }
                             if(result == 1)
                             {
                                 System.out.println("\n");
                                 System.out.println("For winning, you will be rewarded " +party*2 +" food!");
                                 food = food + party;
                                 System.out.println("\n\n");
                             }
                             if(result == 2)
                             {
                                 System.out.println("\n");
                                 System.out.println("You have not gained or lost anything!");
                                 System.out.println("\n\n");
                             }
                         }
                         if((minigame>risk/8)&&(minigame<risk/2))
                         {
                             result = TheGameOfNim.Start_Game();
                             if(result == 0)
                             {
                                 System.out.println("\n");
                                 System.out.println("For loosing, you will be penalized " +(int)party*1.5 +" food!");
                                 food = (int)(food - party*1.5); 
                                 System.out.println("\n\n");
                             }
                             if(result == 1)
                             {
                                 System.out.println("\n");
                                 System.out.println("For winning, you will be rewarded " +party*2.5 +" food!");
                                 food = (int)(food + party*2.5); 
                                 System.out.println("\n\n");
                             }
                         }
                         if((minigame>risk/2)&&(minigame<risk/1.1))
                         {
                             result = RockPaperScissors.Start_Game();                             
                             if(result == 0)
                             {
                                 System.out.println("\n");
                                 System.out.println("For loosing, you will be penalized " +(int)party*2 +" food!");
                                 food = (int)(food - party*2); 
                                 System.out.println("\n\n");
                             }
                             if(result == 1)
                             {
                                 System.out.println("\n");
                                 System.out.println("For winning, you will be rewarded " +party*3 +" food!");
                                 food = (int)(food + party*3); 
                                 System.out.println("\n\n");
                             }
                         }
                         if(minigame>risk/1.1)
                         {
                             result = GuessingGame_1_to_100.Start_Game();
                             if(result > 5)
                             {
                                 System.out.println("\n");
                                 System.out.println("For so many attempts, you will be penalized " +(int)party*3.5 +" pounds of food!");
                                 food = (int)(food - party*3.5);   
                                 System.out.println("\n\n");
                             }
                             if(result <=5)
                             {
                                 System.out.println("\n");
                                 System.out.println("For so little attempts, you will be rewarded " +party*4.5 +" food!");
                                 food = (int)(food + party*4.5);    
                                 System.out.println("\n\n");
                             }
                         }
                    }
                    if(townsDiscovered == oneMoreThanTowns )
                    {
                        nextTown = Ran.nextInt(townsDiscovered*2)+townsDiscovered;
                        oneMoreThanTowns++;
                    }
                     while(decision == 0) // In order to allow them to come back to the menu if they decide not to commit to decision. 
                    {
                        System.out.println("\n");
                        System.out.println("You have " +nextTown +" miles left to the next town");
                        System.out.println("\n\n");
 
                        Travel_Options();
                        decision = Scans.nextInt();
                        System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n ");
                    
                        while(decision == 1)
                        {
                            if(daysTraveledInARow !=0)
                            {
                                riskIncrease = 0;
                                if(Scout == 0)
                                {
                                    riskIncrease = (double)(Math.random()*daysTraveledInARow*1.4567) + (daysTraveledInARow*.34865);
                                }
                                if(Scout == 1)
                                {
                                    riskIncrease = (double)(Math.random()*daysTraveledInARow*.9786) + (daysTraveledInARow*.165);
                                }
                                if(speedLevel == 1)
                                {
                                    riskIncrease = riskIncrease / ((double)(Math.random()*2)+1.2);
                                }
                                if(speedLevel == 3)
                                {
                                    riskIncrease = riskIncrease*2;
                                }
                            }
                            
                            System.out.println("Your risk will increase by "+riskIncrease +" and you will travel " +speed +" miles. Would you like to continue?");
                            System.out.println("1. Yes");
                            System.out.println("2. No Thanks");
                            decision = Scans.nextInt();
                            if(decision == 1)
                            {
                                risk += riskIncrease;
                                daysTraveledInARow++;
                                decision = 19; // get out of the loop
                                if( nextTown > speed)
                                {
                                    if(Scout == 0)
                                    {
                                        nextTown = nextTown - speed;
                                    }
                                    if(Scout == 1)
                                    {
                                        nextTown = nextTown -(speed*1.25);
                                    }
                                    if(speedLevel == 1)
                                    {
                                        nextTown = nextTown +(speed*.5);
                                    }
                                    if(speedLevel == 3)
                                    {  
                                        nextTown = nextTown -(speed*.5);
                                    }
                                }
                                else
                                {
                                    nextTown = 0;
                                }
                            }
                            if(decision == 2)
                            {
                                decision = 0;
                            }
                            System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n ");
                        }
                        if(decision == 2)
                        {
                            System.out.println("Would you like to rest? You will decrease your risk by " +sleepRisk);
                            System.out.println("1. Rest.");
                            System.out.println("2. Return to the menu");
                            decision = Scans.nextInt();
                            if(decision == 1)
                            {
                                decision = 19;
                                risk = risk - sleepRisk;
                                daysTraveledInARow = 0;
                            }
                            if(decision ==2)
                            {
                                decision = 0;
                            }
                        }
                        while(decision == 3)
                        {
                            if(party>1)
                            {
                                if(Scout == 1)
                                    {
                                        System.out.println("You already have a scout out!");
                                        decision = 2;
                                    }
                                if(decision == 3)
                                {
                                System.out.println("Would you like to send a scout forward?");
                                System.out.println("This will decrease your party by 1 for a certain amount of turns");
                                System.out.println("However, your scout will take 5 instead of 1 pounds of food per day, and all upfront.");
                                System.out.println("1. Send a Scout");
                                System.out.println("2. Return to the menu screen.");
                                decision = Scans.nextInt();
                                if(decision == 1)
                                {
                                    System.out.println("How many days would you like to send your scout out for?");
                                    Scoutdays = Scans.nextInt();
                                    Scoutfood = Scoutdays * 5;
                                    if(Scoutfood > food)
                                    {
                                        System.out.println(" You do not have enogh food to do so, try a different amount.");
                                        decision = 3;
                                    }
                                    if(Scoutfood < food)
                                    {
                                        System.out.println("This will consume "+Scoutfood +" pounds of food, but reduce your risk and increase your speed by *1.25 over the next" +Scoutdays +" day(s).");
                                        System.out.println("Would you like to proceed?");
                                        System.out.println("1. Yes");
                                        System.out.println("2. Nah");
                                        decision = Scans.nextInt();
                                        if(decision == 1)
                                        {
                                            food = food - Scoutfood;
                                            party = party - 1;
                                            Scout = 1;
                                        }
                                        if(decision == 2)
                                        {
                                            decision = 3 ;
                                        }
                                    }
                                }
                               }
                            }
                            else
                            {
                                System.out.println("You do not have enough members to send out a scout.");
                                
                            }
                            System.out.println("1. Continue");
                            decision = Scans.nextInt();
                            decision = 0;
                        }            
                        while(decision==4)
                        {
                            System.out.println("Are you sure you would like to continue with suicide?");
                            System.out.println("1. Let me have it!");
                            System.out.println("2. Of course not");
                            decision = Scans.nextInt();
                            if(decision ==2)
                            {
                                decision = 0;
                            }
                            if(decision == 1)
                            {
                                System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n ");
                                entrance = 2;
                            }
                        }
                        if(decision == 5)
                        {
                            System.out.println("You are currently traveling at " +speed +" miles per hour, and speed level " +speedLevel +".");
                            System.out.println("Would you like to: ");
                            Speed_Options();
                            speedLevel = Scans.nextInt();
                            decision = 0;
                        }
                        while(decision == 6)
                        {
                            System.out.println("Which decision would you like help in?");
                            System.out.println("\n\n");
                            Travel_Options();
                            System.out.println("7. Exit");
                            decision = Scans.nextInt();
                            System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
                            if(decision == 1)
                            {
                                System.out.println("Food is consumed based on how many party members you have.");
                                System.out.println("Risk will increase by a random amount determined by the amount of days you have traveled in a row.");
                                System.out.println("Random encounters may occur when traveling with risk.");
                            }
                            if(decision == 2)
                            {
                                System.out.println("Risk is decreased based on your sleeping bag level.");
                                System.out.println("A day is skipped");
                            }
                            if(decision == 3)
                            {
                                System.out.println("The purpose of a Scout is to decrease the overall risk you recieve");
                                System.out.println("You will need to send one of your party members as a Scout.");
                                System.out.println("The Scout will take a large amount of food upfront for its journey.");
                            }
                            if(decision == 4)
                            {
                                System.out.println("This basically just ends the game");
                            }
                            if(decision == 5)
                            {
                                System.out.println("Adjusting your speed results in a faster pace.");
                                System.out.println("A faster pace will increase the amount of risk gained while traveling");
                            }
                            if(decision == 6)
                            {
                                System.out.println("\n\n");
                            }
                            if(decision == 7)
                            {
                                decision = 0;
                            }
                            if(decision !=0)
                            {
                                decision = 6;
                            }
                        }
                        if(nextTown == 0)
                        {
                            town = 1;
                            System.out.println("Now Entering the next Town");
                            System.out.println("1. Enter.");
                            decision = Scans.nextInt();
                        }      
                    }
                }
                
               if(town == 1)
               {
                    decision = 0;
                   while(decision == 0) // In order to allow them to come back to the menu if they decide not to commit to decision. 
                   {
                    System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n ");
                    daysTraveledInARow = 1;
                    display(day, gold, food, party, risk,townsDiscovered); 
                    System.out.println("\n\n\n");
                    Town_Options();
                    decision = Scans.nextInt();
                    System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n ");
                    while(decision == 1)
                    {
                        System.out.println("Would you like to continue on the journey?");
                        System.out.println("1. Yes (Skips a day)");
                        System.out.println("2. No, I want to stay in the town.");
                        decision = Scans.nextInt();
                        System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n ");
                        
                        
                        
                        if(decision == 1)
                        {
                            System.out.println("Your party goes to prepare for the journey");
                            town = 0;
                            townsDiscovered++;
                            decision = 19; // Get out of the loop
                        }
                        if(decision == 2)
                        {
                            
                            Town_Options();
                            decision = Scans.nextInt();
                            System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n ");
                         
                        }
                    }
                    if(decision == 2)
                    {
                        Hotel_Options(party,sleepRisk);
                        decision = Scans.nextInt();
                        if(decision ==1)
                        {
                            if(gold >= (party*3.5)/3)
                            {
                                gold = (int)(gold - (party*3.5)/3);
                                risk = risk - sleepRisk/2;
                                food = food + (party*2)/4;
                                System.out.println("\n");
                                System.out.println("You sleep for the day.");
                                decision = 19;
                            }
                            if(gold < (party*3.5)/3)
                            {
                                System.out.println("You can not afford such luxuries.");
                                decision = 0;
                            }
                        }
                        if(decision == 2)
                        {
                            if(gold >= (party*3.5)/1.5)
                            {
                                gold = (int)(gold - (party*3.5)/1.5);
                                risk = risk - sleepRisk;
                                food = food + (party*2)/2;
                                System.out.println("\n");
                                System.out.println("You sleep for the day.");
                                decision = 19;
                            }
                            if(gold <(party*3.5)/1.5)
                            {
                                System.out.println("You can not afford such luxaries.");
                                decision = 0;
                            }
                        }
                        if(decision == 3)
                        {
                            if(gold >= (party*3.5)*1.2)
                            {
                                gold = (int)(gold - (party*3.5)*1.2);
                                risk = risk - sleepRisk*2;
                                food = food + (party*2);
                                System.out.println("\n");
                                System.out.println("You sleep for the day.");
                                decision = 19;
                            }
                            if(gold < (party*3.5)*1.2)
                            {
                                System.out.println("You can not afford such luxaries.");
                                decision = 0;
                            }
                        }
                    }
                    while(decision == 3)
                    {
                        Market_Display(gold,food,carriageLevel,sleepingBagLevel,foodCapacity);
                        System.out.println("\n\n");
                        System.out.println("Welcome to my shop, what would you like to buy?");
                        System.out.println("");
                        Market_Options();
                        decision = Scans.nextInt();
                        System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n ");
                        if(decision == 1)
                           {
                            System.out.println("Food sells for  $10 a pound");
                            System.out.println("How many pounds of food would you like to buy?");
                            cost = Scans.nextInt();
                            cost = cost * 10;  
                            if((food+cost)<(foodCapacity))
                               {
                                if(cost>gold)
                                {
                                        System.out.println("What, don't think I can do math??? You can not afford that much food. Get out of my shop.");
                                        decision = 0;
                                }
                                if(cost< gold)
                                {
                                    gold = gold - cost; 
                                    System.out.println("Thank you for your money. That will be " +decision +" pounds of food for " +cost +" gold. You are now left with " +gold +" gold");
                                    food += cost; 
                                }
                            }
                            if((food+cost) > foodCapacity)
                            {
                                System.out.println("You can't carry that much food.");
                                System.out.println("\n\n\n");
                            }   
                            cost = 1; 
                           } 
                        if(decision == 2)
                        {
                            System.out.println("A better sleeping bag will cost you " +(nextSleepingBagLevel*300) +" gold. Would you like to upgrade to level " +nextSleepingBagLevel +"?");
                            System.out.println("1. Yes of course.");
                            System.out.println("2. Nope.");
                            decision = Scans.nextInt();
                            cost = nextSleepingBagLevel*300;
                            if(decision == 1)
                            {
                                if(cost > gold)
                                {
                                    System.out.println("You don't have that kind of money, now get out of my shop!");
                                    decision = 0;
                                }
                                if(cost < gold)
                                {
                                    System.out.println("Congratulations! For " +cost +" gold, you have upgrading your sleeping bag to level " +nextSleepingBagLevel +"!");
                                    gold = gold - cost;
                                    sleepingBagLevel++;
                                }
                            } 
                            if(decision == 2)
                            {
                                decision = 3;
                            }
                            cost = 1;
                        }
                        if(decision == 3)
                        {
                                System.out.println(" Upgrading your carriage will increse your food capacity and speed");
                                cost = nextCarriageLevel*500;
                                System.out.println(" Would you like to upgrade your carriage to level " +nextCarriageLevel +"? It will cost you " +cost +" gold.");
                                System.out.println("1. Yes of course.");
                                System.out.println("2. Nope.");
                                decision = Scans.nextInt();
                                if(decision == 1)
                                {
                                    if(cost > gold)
                                    {
                                        System.out.println("You don't have that kind of money, now get out of my shop!");
                                        decision = 0;
                                    }
                                    if(cost < gold)
                                    {
                                        System.out.println("Congratulations! For " +cost +" gold, you have upgrading your carriage to level " +nextCarriageLevel +"!");
                                        carriageLevel++;
                                        gold = gold - cost;
                                    }
                                }
                                if(decision == 2)
                                {
                                    decision = 3;
                                }
                                cost = 1;
                        }
                        if(decision == 4)
                        {
                            decision = 0; 
                        }
                        while(decision == 5)
                        {
                            System.out.println("What would do you require more information on?");
                            System.out.println("\n\n");
                            Market_Options();
                            System.out.println("6. Exit help.");
                            decision = Scans.nextInt();
                            System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n ");
                            if(decision == 1)
                            {
                                System.out.println("Food is required to stay alive in the game. No food, no life.");
                                System.out.println("More party members means more food required");
                            }
                            if(decision == 2)
                            {
                               System.out.println("Upgrading your sleeping bag will increase the effeciency of resting");
                               System.out.println("A higher sleeping bag level will decrease your risk a greater amount when you rest.");
                            }
                            if(decision == 3)
                            {
                                System.out.println("A higher carriage level will result in a higher traveling speed and food capacity.");
                            }
                            if(decision == 4)
                            {
                                System.out.println("You exit the shop....");
                            }
                            if(decision == 5)
                            {
                                System.out.println("\n\n");
                            }
                            if(decision == 6)
                            {
                                decision = 0;
                            }
                            if(decision != 0)
                            {
                                decision = 5;
                            }
                        }
                        if(decision !=0)
                        {
                            decision = 3;
                        }
                    }
                    if( decision == 4)
                    {
                        System.out.println("Eating at the restaurant will cost you "+(party*3.5)+" gold. Would you like to proceed?");
                        System.out.println("1. Continue");
                        System.out.println("2. I don't have that kind of money.");
                        decision = Scans.nextInt();
                        if(decision == 1)
                        {
                            if((party*3.5)>gold)
                            {
                                System.out.println("You do not have that kind of money.");
                                decision = 0;
                            }
                            if((party*3.5)<gold)
                            {
                                gold = gold - (int)(party*3.5);
                                random = ((double)(Math.random()*10));
                                if(random<=.5)
                                {
                                    System.out.println("Congratulations! You have recieved " +party*20 +" pounds of food!!!");
                                    food = food + party*20; 
                                    if((food+decision) > foodCapacity)
                                    {
                                        System.out.println("You can't carry that much food. Your food has been filled to capacity.");
                                        food = foodCapacity;
                                    } 
                                }
                                if((random>.5)&&(random<=2))
                                {
                                    System.out.println("Congratulations! You have recieved " +party*20 + " pounds of food!!");
                                    food = food + party*20;
                                     if((food+decision) > foodCapacity)
                                     {
                                        System.out.println("You can't carry that much food. Your food has been filled to capacity.");
                                        food = foodCapacity;
                                    } 
                                }
                                if((random>2)&&(random<=5))
                                {
                                    System.out.println("Congratulations! You have recieved " +party*2 + " pounds of food!");
                                    food = food + party*2;
                                    if((food+decision) > foodCapacity)
                                    {
                                        System.out.println("You can't carry that much food. Your food has been filled to capacity.");
                                        food = foodCapacity;
                                    } 
                                }
                                if((random>5)&&(random<=7))
                                {
                                    System.out.println("Congratulations! You made your money's back in food. " +party*2 +" pounds of food coming your way.");
                                    food = food + party*2;
                                    if((food+decision) > foodCapacity)
                                    {
                                        System.out.println("You can't carry that much food. Your food has been filled to capacity.");
                                        food = foodCapacity;
                                    } 
                                }
                                if((random>7)&&(random<=9.5))
                                {
                                    System.out.println("Congratulations! You just lost your money for no apparent reason!");
                                    
                                }
                                if((random>9.5)&&(random<=10))
                                {
                                    System.out.println("Congratulations! You have just lost more money because of the absolute mess you made, and been served no food because of it!!");
                                    gold = gold - 10;
                                    if(gold < 10)
                                    {
                                        System.out.println("Due to your desperate situation, the owners have decided you grace you and let you off for the day");
                                        decision = 19; 
                                    }
                                }
                            }
                        }
                        if(decision == 2)
                        {
                            decision = 0;
                        }
                    }
                    if(decision == 5)
                    {
                        random = ((double)(Math.random()*10));
                        if(random<=.5)
                        {
                            party = party - 1;
                            System.out.print("Upon entry, your party member died in a brawl! Your party has decreased to " +party +" members.");
                        }
                        if((random>.5)&&(random<=.8))
                        {
                            System.out.println("A random individual wants to join your party! Allow him in?");
                            System.out.println("1. Yes, of course!");
                            System.out.println("2. He can find his own friends.");
                            decision = Scans.nextInt();
                            if(decision == 1)
                            {
                                party++;
                                System.out.println("Congratulations! You have gained a member, making your party a total of " +party +" members!");
                            }
                            if(decision == 2)
                            {
                                System.out.println("You have lost an amazing opportunity!");
                            }
                        }
                        if((random>.8)&&(random<=1.5))
                        {
                            System.out.println("Beer is on the house today! Your risk decreases by "+sleepRisk*2 +" and you will not loose any food today!");
                            risk = risk -sleepRisk*2;
                            food = food + party*2;
                        }
                        if((random>1.5)&&(random<=2))
                        {
                            System.out.println("You have gained intel for the next few days of travel! You will recieve the perks of having a scout for " +party*2 +" days (you will still lose a member for the time)!");
                            Scout = 1;
                            party = party -1; 
                            Scoutdays = party*2;
                        }
                        if((random>2)&&(random<=3))
                        {
                            System.out.println("Some dude was handing out money for free. Nice.");
                            System.out.println(+party*2 +" gold");
                            gold = gold + party*2; 
                        }
                        System.out.println("You can hire an extra member for your party for the cost of " +party*20 +" gold. Would you like to purhcase his services?");
                        System.out.println("1. Yes.");
                        System.out.println("2. Nope.");
                        decision = Scans.nextInt();
                        if(decision == 1)
                        {
                            if(gold < party*20)
                            {
                                System.out.println("You do not have enough gold to hire him");
                            }
                            if(gold > party*20)
                            {
                                party++;
                                System.out.println("Congratulations, you have increased you party to " +party +" members!");
                                gold = gold - party*20;
                            }       
                        }
                        if(decision == 2)
                        {
                            decision = 0;
                        }
                        System.out.println("Your time in the tavern has caused the day to end.");
                        decision = 19;
                    }
                    System.out.println("");
                    while(decision == 6)
                    {
                        System.out.println("What do you require more information on?");
                        System.out.println("\n\n");
                        Town_Options();
                        System.out.println("7. Exit help.");
                        decision = Scans.nextInt();
                        System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n ");
                        if(decision == 1)
                        {
                            System.out.println("Leave the town and continue your journey onto the next town.");
                        }
                        if(decision == 2)
                        {
                            System.out.println("Similar to resting while on your travels, but requires gold and provides some food.");
                        }
                        if(decision == 3)
                        {
                            System.out.println("You will become presented with multiple options to buy food or upgrade items.");
                        }
                        if(decision == 4)
                        {
                            System.out.println("After an entry fee, you will be provided with a random amount of food.");
                        }
                        if(decision == 5)
                        {
                            System.out.println("After a random encounter, you will have the option to hire another party member.");
                        }
                        if(decision == 6)
                        {
                            decision = 6;
                        }
                        if(decision == 7)
                        {
                            decision = 0;
                        }
                        if(decision != 0)
                        {
                            decision = 6;
                        }
                    }
                 }
               }
               if(party == 0)
               {
                   entrance =2;
               }
               if(entrance == 1)
               {    
                    if(town == 0)
                    {
                        System.out.println("For having " +party +" members in your party, you have gained " +(party*3.5) +" gold!");
                        System.out.println("For having " +party +" members in your party, you have lost " +(party*2) +" pounds of food!");
                        System.out.println("1. Continue");
                        decision = Scans.nextInt();
                        food = food - (party*2);
                        gold = gold + (int)(party*3.5);
                        System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n ");
                       if(Scoutdays > 0)
                       {
                           Scoutdays = Scoutdays - 1;
                       }
                       if(Scoutdays == 1)
                       {
                           Scout = 0;
                           party = party+1;
                           Scoutdays = Scoutdays - 1; 
                        }
                    }
                    if(town == 1)
                    {
                        System.out.println("For having " +party +" members in your party, you have gained " + (party*4.6) + " gold!");
                        
                        System.out.println("For having " +party +" members in your party, you have lost " + (party) + " pounds of food!");
                        System.out.println("1. Continue");
                        decision = Scans.nextInt();
                        food = food - (party);
                        gold = gold + (int)(party*4.6);
                        System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n ");
                    }
                    if(food == 0 || food< 0)
                    {
                        entrance = 2;
                    }
               }
               day++;
               if(townsDiscovered == goal)
               {
                   System.out.println("Congratulations! You have met your goal of " +goal +" towns discovered!");
                   System.out.println("Would you like to continue?");
                   System.out.println("1. Continue.");
                   System.out.println("2. End the game");
                   decision = Scans.nextInt();
                   if(decision ==1)
                   {
                       decision = 0;
                   }
                   if(decision == 2)
                   {
                       entrance = 2;
                   }
                }
            }
            if(entrance == 2)
             {
                System.out.println("Your endevours end as you watch your life leave for your body. You discovered a total of " +townsDiscovered +" towns.");
                System.out.println("And lived for a total of " +day +" days.");
            }
        }
    }
 
 
 
 



