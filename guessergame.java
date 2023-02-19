import java.util.Scanner;


class Guesser{
    int guessThenum;

    public int guesseThenum() 
    {
         Scanner  scan =new Scanner(System.in);
         System.out.println("Heyy Guesser pls guess the Number :  ");
         guessThenum=scan.nextInt();
         return guessThenum;
    }
}

class Player
{
      int plyGuessTheNum;

    public int guessNumber()
     { 
        Scanner  scan =new Scanner(System.in);
        System.out.println("Heyy Player pls guess the Number :  ");
        plyGuessTheNum=scan.nextInt();
        return plyGuessTheNum;
    
    }   
}

class Umpire
{
    int collectThenumFromguesser;
    int collectThenumFromPly1;
    int collectThenumFromPly2;
    int collectThenumFromPly3;

    public void getTheNumFromTheGusser()
    {
        Guesser g =new Guesser();
        collectThenumFromguesser=g.guesseThenum();
    }

    public void getTheNumFromThePlayer()
    {
         Player p1= new Player();
         Player p2= new Player();
         Player p3= new Player();

         collectThenumFromPly1=p1.guessNumber();
         collectThenumFromPly2=p2.guessNumber();
         collectThenumFromPly3=p3.guessNumber();
    }

     void calculatedres() 
    {   System.out.print("Game Result are :  ");
       if(collectThenumFromguesser == collectThenumFromPly1)
       {
           if(collectThenumFromguesser==collectThenumFromPly2 && collectThenumFromguesser==collectThenumFromPly3)
           {
               System.out.println("All are the winners");
            }
            else if(collectThenumFromguesser==collectThenumFromPly2)
            {
                System.out.println("Player 1 & 2 are the winners");
            }
            else if (collectThenumFromguesser==collectThenumFromPly3)
            {
                System.out.println("Player 1 & 3 are the winners");
            }
            else
              {
                  System.out.println("Player 1 won the Game");
              }
        }
       else if(collectThenumFromguesser==collectThenumFromPly2)
       {
           if(collectThenumFromguesser==collectThenumFromPly3)
           {
               System.out.println("Player 2 & 3 are the winners");
           }
           else
           {
               System.out.println("Player 2 won the game");
           }
       }
       else if(collectThenumFromguesser==collectThenumFromPly3)
       {
           System.out.println("Player 3 won the game");
       }

       else
       {
        System.out.println("Game lost !! Try again");
       }
    } 
}

public class guessergame {
     public static void main(String[] args) {
          Umpire u= new Umpire();
          u.getTheNumFromTheGusser();
          u.getTheNumFromThePlayer();
          u.calculatedres();
     } 
}


