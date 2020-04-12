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
        boolean valid = false;
        boolean end = false;
        
        //create players and add them to array list of Players
        Player p1 = new Player("Player 1");
        Player p2 = new Player("Player 2");
        //create hands
        p1.getHand().buildHand(goc.getCards());
        p2.getHand().buildHand(goc.getCards());
        
        //loop for the game, the loop will continue playing each player's turn until the end boolean is true
        while(end==false){
            //player 1's turn, hand is shown and player can guess a card
            System.out.println("Player 1's turn");
            System.out.println("Your Hand:");
            p1.getHand().showCards();
            System.out.println("Guess card value: ace, two, three, four, five, six, seven, eight, nine, ten, jack, queen, king");
            //loop to check if input is valid
            while(valid=false){
                //player guess
                value = in.next();
                switch(value){
                    case "ace":
                        guess = new Card(Card.Suit.CLUBS, Card.Value.ACE);
                        valid = true;
                        break;
                    case "two":
                        guess = new Card(Card.Suit.CLUBS, Card.Value.TWO);
                        valid = true;
                        break;
                    case "three":
                        guess = new Card(Card.Suit.CLUBS, Card.Value.THREE);
                        valid = true;
                        break;
                    case "four":
                        guess = new Card(Card.Suit.CLUBS, Card.Value.FOUR);
                        valid = true;
                        break;
                    case "five":
                        guess = new Card(Card.Suit.CLUBS, Card.Value.FIVE);
                        valid = true;
                        break;
                    case "six":
                        guess = new Card(Card.Suit.CLUBS, Card.Value.SIX);
                        valid = true;
                        break;
                    case "seven":
                        guess = new Card(Card.Suit.CLUBS, Card.Value.SEVEN);
                        valid = true;
                        break;
                    case "eight":
                        guess = new Card(Card.Suit.CLUBS, Card.Value.EIGHT);
                        valid = true;
                        break;
                    case "nine":
                        guess = new Card(Card.Suit.CLUBS, Card.Value.NINE);
                        valid = true;
                        break;
                    case "ten":
                        guess = new Card(Card.Suit.CLUBS, Card.Value.TEN);
                        valid = true;
                        break;
                    case "jack":
                        guess = new Card(Card.Suit.CLUBS, Card.Value.JACK);
                        valid = true;
                        break;
                    case "queen":
                        guess = new Card(Card.Suit.CLUBS, Card.Value.QUEEN);
                        valid = true;
                        break;
                    case "king":
                        guess = new Card(Card.Suit.CLUBS, Card.Value.KING);
                        valid = true;
                        break;
                    default:
                        System.out.println("Guess invalid, try again. Make sure there are no spaces and all letters are lower case");
                        valid = false;
                        break;
                }
            }
            
            
            
            valid = false;
            gfa.play(guess, p1, p2);
            p1.addPoint(p1, guess);
            end = gfa.declareWinner(p1, p2, guess);

            if(end==true)
                break;

            //player 1's turn, hand is shown and player can guess a card
            System.out.println("Player 2's turn");
            System.out.println("Your Hand:");
            p2.getHand().showCards();
            System.out.println("Guess card value: ace, two, three, four, five, six, seven, eight, nine, ten, jack, queen, king");
            //loop to check if input is valid
            while(valid=false){
                value = in.next();
                switch(value){
                    case "ace":
                        guess = new Card(Card.Suit.CLUBS, Card.Value.ACE);
                        valid = true;
                        break;
                    case "two":
                        guess = new Card(Card.Suit.CLUBS, Card.Value.TWO);
                        valid = true;
                        break;
                    case "three":
                        guess = new Card(Card.Suit.CLUBS, Card.Value.THREE);
                        valid = true;
                        break;
                    case "four":
                        guess = new Card(Card.Suit.CLUBS, Card.Value.FOUR);
                        valid = true;
                        break;
                    case "five":
                        guess = new Card(Card.Suit.CLUBS, Card.Value.FIVE);
                        valid = true;
                        break;
                    case "six":
                        guess = new Card(Card.Suit.CLUBS, Card.Value.SIX);
                        valid = true;
                        break;
                    case "seven":
                        guess = new Card(Card.Suit.CLUBS, Card.Value.SEVEN);
                        valid = true;
                        break;
                    case "eight":
                        guess = new Card(Card.Suit.CLUBS, Card.Value.EIGHT);
                        valid = true;
                        break;
                    case "nine":
                        guess = new Card(Card.Suit.CLUBS, Card.Value.NINE);
                        valid = true;
                        break;
                    case "ten":
                        guess = new Card(Card.Suit.CLUBS, Card.Value.TEN);
                        valid = true;
                        break;
                    case "jack":
                        guess = new Card(Card.Suit.CLUBS, Card.Value.JACK);
                        valid = true;
                        break;
                    case "queen":
                        guess = new Card(Card.Suit.CLUBS, Card.Value.QUEEN);
                        valid = true;
                        break;
                    case "king":
                        guess = new Card(Card.Suit.CLUBS, Card.Value.KING);
                        valid = true;
                        break;
                    default:
                        System.out.println("Guess invalid, try again. Make sure there are no spaces and all letters are lower case");
                        valid = false;
                        break;
                }
            }
            valid = false;
            gfa.play(guess, p2, p1);
            p2.addPoint(p2, guess);
            end = gfa.declareWinner(p1, p2, guess);
        }
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
    public boolean declareWinner(Player playerOne, Player playerTwo, Card guess) {

        if (playerOne.getHand().getPlayersHand().isEmpty()) {
            if (goc.getCards().isEmpty()) {
                int p1Points = playerOne.getPoints();
                int p2Points = playerTwo.getPoints();
                if (p1Points > p2Points) {
                    System.out.println(playerOne.getPlayerID() + " is the winner");
                    return true;
                } else if(p1Points < p2Points) {
                    System.out.println(playerTwo.getPlayerID() + " is the Winner");
                    return true;
                }
                else{
                    System.out.println("It's a tie");
                    return true;
                }
            } else {
                playerOne.getHand().drawFive(goc.getCards());
                return false;
            }
        }
        return false;
    }
}
