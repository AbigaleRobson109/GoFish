/*
        Name:  Abigale Robson, David Klatt, Ostap 
        Assignment:  Go Fish
        Program: PROG24178
        Date: April 16, 2020
    
        Description:
        Main application to run go fish game and get user input to play
 */
package ca.sheridancollege.project;

import java.util.Scanner;

/**
 *
 * @author abiga
 */
public class GoFishApp extends Game {

    private static final GroupOfCards goc = GroupOfCards.getInstance();
    private static final GoFishApp gfa = new GoFishApp("Go Fish", "Players");

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        goc.setCards();
        //create players and add them to array list of Players
        Player p1 = new Player("Player 1");
        Player p2 = new Player("Player 2");
        boolean end = false;
        //create hands
        p1.getHand().buildHand(goc.getCards());
        p2.getHand().buildHand(goc.getCards());

        while (!end) {
            //ask for guess
            System.out.println("Player one Turn");
            //show players 1 hand
            p1.getHand().showCards();
            //create card guess

            String value = getValue();
            //play method
            gfa.play(value, p1, p2);
            //get point method
             p1.addPoint(p1, value);
            //declarewWinner
            gfa.declareWinner(p1, p2, value);

            //player 2 turn
            System.out.println("Player 2 turn");
            p2.getHand().showCards();
            value = getValue();
            gfa.play(value, p2, p1);

        }
    }

    public static String getValue() {
        System.out.println("Enter the card value");
        Scanner in = new Scanner(System.in);
        String suit;
        suit = in.next().toUpperCase();
        if (suit.equals("ACE") || suit.equals("TWO") || suit.equals("THREE")
                || suit.equals("FOUR") || suit.equals("FIVE") || suit.equals("SIX")
                || suit.equals("SEVEN") || suit.equals("EIGHT") || suit.equals("NINE")
                || suit.equals("TEN") || suit.equals("JACK") || suit.equals("QUEEN")
                || suit.equals("KING")) {
        } else {
            System.out.println("Guess invalid, try again.");
            suit = getValue();
        }
        return suit;
    }

    public GoFishApp(String gameName, String name) {
        super(gameName, name);
    }

    @Override
    public void play(String guess, Player playerTurn, Player playerOther) {
        int index;
        try {
            index = playerOther.getHand().search(guess);
            if (index != -1) {
                System.out.println("You guessed it!");
                System.out.println(index);
//              //add card to players hand
              playerTurn.getHand().getPlayersHand().add(playerOther.getHand().getPlayersHand().get(index));
//              //remove from players hand
              playerOther.getHand().getPlayersHand().remove(index);
            } else {
                playerTurn.getHand().draw(goc.getCards());
                System.out.println("Go Fish");

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    @Override
    public void declareWinner(Player playerOne, Player playerTwo, String guess) {

        if (playerOne.getHand().getPlayersHand().isEmpty()) {
            if (goc.getCards().isEmpty()) {
                int p1Points = playerOne.getPoints();
                int p2Points = playerTwo.getPoints();
                if (p1Points > p2Points) {
                    System.out.println(playerOne.getPlayerID() + " is the winner");
                } else if (p1Points < p2Points) {
                    System.out.println(playerTwo.getPlayerID() + " is the Winner");
                } else {
                    System.out.println("It's a tie");
                }
            } else {
                playerOne.getHand().drawFive(goc.getCards());
            }
        }
    }
}
