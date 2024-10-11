package coe318.lab5;
import java.util.Scanner;

public class SimpleUI implements UserInterface {
    private BlackjackGame game;
    private Scanner user = new Scanner(System.in);

  @Override
    public void setGame(BlackjackGame game) {
        this.game = game;
    }

  @Override
    public void display() {
        System.out.println("\n===========");
        System.out.println("House Holds: \n===========" + this.game.getHouseCards().toString()); 
        System.out.println("=========");
        System.out.println("You Hold: \n=========" + this.game.getYourCards().toString());
        System.out.println(" |||");
        System.out.println("*****");
        System.out.println( " *** ");
        System.out.println("  *");
    }
  @Override
    public boolean hitMe() {
        System.out.println("Would you like a hit? (y/n)");
        String choice = user.nextLine();
        boolean hit = false;
        switch(choice){
            case "y" -> hit = true;
            case "n" -> hit = false;
            default -> {
                System.out.println("You must type either 'y' or 'n'.");
            }

        }
        System.out.println("-----------------------------");
        return(hit);
    }

  @Override
    public void gameOver() {
        this.display();
        int yourScore = game.score(game.getYourCards());
        int houseScore = game.score(game.getHouseCards());
        System.out.println("House Score: " + houseScore + ", Your Score: " + yourScore);
        if( (yourScore > houseScore || houseScore > 21) && (yourScore <= 21)){
            System.out.println("You Win!");
        }else{
            System.out.println("House Wins!");
        }
       System.out.println("Thanks for playing!");

    }

}