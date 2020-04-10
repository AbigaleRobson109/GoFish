/*
        Name:  Abigale Robson
        Assignment:  [assignment name]
        Program: PROG24178
        Date:  [assignment due date here]
    
        Description:
        [program description in your own words]
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 *
 * @author abiga
 */
public class GoFishApp extends Game {

    private static GroupOfCards goc = GroupOfCards.getInstance();
    private static GoFishApp gfa = new GoFishApp("Go Fish", "Players");

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        goc.setCards();
        //create players and add them to array list of Players
        Player p1 = new Player("Player 1");
        Player p2 = new Player("Player 2");
        //create hands
        p1.getHand().buildHand(goc.getCards());
        p2.getHand().buildHand(goc.getCards());

        //show players 1 hand
        p1.getHand().showCards();
        p2.getHand().showCards();
        //ask for guess
        Card guess = new Card(Card.Suit.CLUBS, Card.Value.ACE);
        //play method
        gfa.play(guess, p1, p2);
        //get point method
        p1.addPoint(p1, guess);
        //declarewWinner
        gfa.declareWinner(p1, p2, guess);
    }

    public GoFishApp(String gameName, String name) {
        super(gameName, name);
    }

    @Override
    public void play(Card guess, Player playerTurn, Player playerOther) {
        boolean valid;
        int index;
        try {
            for(int i = 0; i < playerOther.getHand().getPlayersHand().size(); i++) {
                valid = playerOther.getHand().search(guess);
                if (valid) {
                    index = playerOther.getHand().getPlayersHand().indexOf(guess);
                    //add card to players hand
                    playerTurn.getHand().getPlayersHand().add(playerOther.getHand().getPlayersHand().get(index));
                    //remove from players hand
                    playerOther.getHand().getPlayersHand().remove(guess);
                } else {
                    playerTurn.getHand().draw(goc.getCards());
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    @Override
    public void declareWinner(Player playerOne, Player playerTwo, Card guess) {

        if (playerOne.getHand().getPlayersHand().isEmpty()) {
            if (goc.getCards().isEmpty()) {
                int p1Points = playerOne.getPoints();
                int p2Points = playerTwo.getPoints();
                if (p1Points > p2Points) {
                    System.out.println(playerOne.getPlayerID() + " is the winner");
                } else if(p1Points < p2Points) {
                    System.out.println(playerTwo.getPlayerID() + " is the Winner");
                }
                else{
                    System.out.println("It's a tie");
                }
            } else {
                playerOne.getHand().drawFive(goc.getCards());
            }
        }
    }
}
