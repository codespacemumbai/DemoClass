import java.util.*;

public class Stone {
    static Scanner sc = new Scanner(System.in);
    static int result=0;
    static int p=0;
    public static void main(String args[]) {
        boolean quit = false;
        System.out.println("========================================");
        System.out.println("Welcome to the rock paper scissor game");
        System.out.println("========================================");
        System.out.println();
        int score = 0;
        int comp_score = 0;
        int win_percent = 0;
        int num_rounds = 0;
        while (quit == false) 
        {
            System.out.println("Round Number: " + num_rounds);
            System.out.println("Current Score: \t\t Player: " + score + "\tComputer: " + comp_score+ "\tWin Percentage: " + win_percent + "%");
            System.out.println(" Choose an option to play R(Rock)/P(Paper)/S(Scissor) or Q to quit");
            char x = sc.next().charAt(0);
            if(x!='R' && x!='P' && x!='S' && x!='Q')
            {
                System.out.println("Please give a correct input!");
                continue;
            }
            if (x=='Q'){
                System.out.println("HOPE YOU HAD FUN");
                System.out.println("Rounds Played: "+num_rounds);
                System.out.println("FINAL SCORES:\tPlayer: "+score+"\tComputer: "+comp_score+"\tWin Percentage: "+win_percent+"%"); 
                quit=true;
                break;
            }
            else
            {
                System.out.println("You chose: ");
                
                switch(x)
                {
                    case 'R':   System.out.println("Rock");
                                p=0;
                                break;
                    case 'P':   System.out.println("Paper");
                                p=1;
                                break;
                    case 'S':   System.out.println("Scissors");
                                p=2;
                                break;
                }
                System.out.println("Waiting for the computer's choice..............");
                System.out.println("...");
                int c= new Random().nextInt(3+1);
                System.out.println("Computer Chose: ");
                switch(c)
                {
                    case 0: System.out.println("Rock");
                            break;
                    case 1: System.out.println("Paper");
                            break;
                    case 2: System.out.println("Scissors");
                            break;
                }

                
                if(p==0)
                {
                    if(c==0)
                    {
                        result=0;
                    }
                    else if(c==1)
                        result=-1;
                    else
                        result=1;
                }
                if(p==1)
                {
                    if(c==0)
                        result=1;
                    else if(c==1)
                        result=0;
                    else
                        result=-1;
                }
                if(p==2)
                {
                    if(c==0)
                        result=-1;
                    else if(c==1)
                        result=0;
                    else
                        result=0;
                }
                ++num_rounds;
                if(result==0)
                {
                    System.out.println("It's a DRAW!");
                    win_percent=(score*100)/num_rounds;
                }
                else if(result==1)
                {
                    System.out.println("You WON this round! Well done!");
                    ++score;
                    win_percent=(score*100)/num_rounds;
                }
                else
                {
                    System.out.println("You LOST this round :(");
                    ++comp_score;
                    win_percent= (score*100)/num_rounds;
                }

                }

            }

        }

    }
