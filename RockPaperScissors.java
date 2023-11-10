import java.util.Random;
import java.util.Scanner;
public class RockPaperScissors{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
        String[] rps ={"r", "p", "s"};
        String computerMove =rps[new Random().nextInt(rps.length)];

        
        String playerMove;

        while(true) {
          System.out.println("please enter your move(r, p or s)");
          playerMove = scanner.nextLine();
          if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s") ){
            break;
          }
          System.out.println(playerMove + "is not a valid move.");
         }

         System.out.println("computer played: " + computerMove);

         if(playerMove.equals(computerMove)){
            System.out.println(" tie!");
         } else if(playerMove.equals("r")) {
            if (computerMove.equals("p")) {
                System.out.println("you lose");

            }else if (computerMove.equals("s")){
              
                System.out.println("you won");
            }
            

         } else if(playerMove.equals("p")) {
            if (computerMove.equals("r")) {
                System.out.println("you win");

            }else if (computerMove.equals("s")){
              
                System.out.println("you lose");
            }
            

         } else if(playerMove.equals("s")) {
            if (computerMove.equals("p")) {
                System.out.println("you win");

            }else if (computerMove.equals("r")){
              
                System.out.println("you won");
            }
            

        }

         System.out.println("play again (y/n): ");
         String playAgain = scanner.nextLine();

         if(!playAgain.equals("y")) {
             break;
            }

        }
    }
}