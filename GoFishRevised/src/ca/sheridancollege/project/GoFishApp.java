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
import java.util.Scanner;

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
        Scanner in = new Scanner(System.in);
        goc.setCards();
        String value = "";
        Card guess = new Card(Card.Suit.CLUBS, Card.Value.ACE);
        
        //create players and add them to array list of Players
        Player p1 = new Player("Player 1");
        Player p2 = new Player("Player 2");
        //create hands
        p1.getHand().buildHand(goc.getCards());
        p2.getHand().buildHand(goc.getCards());
        
        
        System.out.println("Player 1's turn");
        System.out.println("Your Hand:");
        p1.getHand().showCards();
        System.out.println("Guess card value: ace, two, three, four, five, six, seven, eight, nine, ten, jack, queen, king");
        value = in.next();
        
        switch(value){
            case "ace":
                guess = new Card(Card.Suit.CLUBS, Card.Value.ACE);
                break;
            case "two":
                guess = new Card(Card.Suit.CLUBS, Card.Value.TWO);
            case "three":
                guess = new Card(Card.Suit.CLUBS, Card.Value.THREE);
            case "four":
                guess = new Card(Card.Suit.CLUBS, Card.Value.FOUR);
            case "five":
                guess = new Card(Card.Suit.CLUBS, Card.Value.FIVE);
            case "six":
                guess = new Card(Card.Suit.CLUBS, Card.Value.SIX);
            case "seven":
                guess = new Card(Card.Suit.CLUBS, Card.Value.SEVEN);
            case "eight":
                guess = new Card(Card.Suit.CLUBS, Card.Value.EIGHT);
            case "nine":
                guess = new Card(Card.Suit.CLUBS, Card.Value.NINE);
            case "ten":
                guess = new Card(Card.Suit.CLUBS, Card.Value.TEN);
            case "jack":
                guess = new Card(Card.Suit.CLUBS, Card.Value.JACK);
            case "queen":
                guess = new Card(Card.Suit.CLUBS, Card.Value.QUEEN);
            case "king":
                guess = new Card(Card.Suit.CLUBS, Card.Value.KING);
        }
                
        
        
        
        gfa.play(guess, p1, p2);
        p1.addPoint(p1, guess);
        gfa.declareWinner(p1, p2, guess);
        
        
        

        System.out.println("Player 1's turn");
        System.out.println("Your Hand:");
        p1.getHand().showCards();
        System.out.println("Guess card value: ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING");
        value = in.next();
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
                    System.out.println("Go Fish");
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
