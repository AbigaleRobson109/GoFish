/*
        Name:  Abigale Robson
        Assignment:  [assignment name]
        Program: PROG24178
        Date:  [assignment due date here]
    
        Description:
        [program description in your own words]
 */
//loop to check if input is valid
//            while(valid==false){
//                //player guess
//                value = in.next();
//                switch(value){
//                    case "ace":
//                        guessclub = new Card(Card.Suit.CLUBS, Card.Value.ACE);
//                        guessheart = new Card(Card.Suit.HEARTS, Card.Value.ACE);
//                        guessspade = new Card(Card.Suit.SPADES, Card.Value.ACE);
//                        guessdiamond = new Card(Card.Suit.DIAMONDS, Card.Value.ACE);
//                        valid = true;
//                        break;
//                    case "two":
//                        guessclub = new Card(Card.Suit.CLUBS, Card.Value.TWO);
//                        guessheart = new Card(Card.Suit.HEARTS, Card.Value.TWO);
//                        guessspade = new Card(Card.Suit.SPADES, Card.Value.TWO);
//                        guessdiamond = new Card(Card.Suit.DIAMONDS, Card.Value.TWO);
//                        valid = true;
//                        break;
//                    case "three":
//                        guessclub = new Card(Card.Suit.CLUBS, Card.Value.THREE);
//                        guessheart = new Card(Card.Suit.HEARTS, Card.Value.THREE);
//                        guessspade = new Card(Card.Suit.SPADES, Card.Value.THREE);
//                        guessdiamond = new Card(Card.Suit.DIAMONDS, Card.Value.THREE);
//                        valid = true;
//                        break;
//                    case "four":
//                        guessclub = new Card(Card.Suit.CLUBS, Card.Value.FOUR);
//                        guessheart = new Card(Card.Suit.HEARTS, Card.Value.FOUR);
//                        guessspade = new Card(Card.Suit.SPADES, Card.Value.FOUR);
//                        guessdiamond = new Card(Card.Suit.DIAMONDS, Card.Value.FOUR);
//                        valid = true;
//                        break;
//                    case "five":
//                        guessclub = new Card(Card.Suit.CLUBS, Card.Value.FIVE);
//                        guessheart = new Card(Card.Suit.HEARTS, Card.Value.FIVE);
//                        guessspade = new Card(Card.Suit.SPADES, Card.Value.FIVE);
//                        guessdiamond = new Card(Card.Suit.DIAMONDS, Card.Value.FIVE);
//                        valid = true;
//                        break;
//                    case "six":
//                        guessclub = new Card(Card.Suit.CLUBS, Card.Value.SIX);
//                        guessheart = new Card(Card.Suit.HEARTS, Card.Value.SIX);
//                        guessspade = new Card(Card.Suit.SPADES, Card.Value.SIX);
//                        guessdiamond = new Card(Card.Suit.DIAMONDS, Card.Value.SIX);
//                        valid = true;
//                        break;
//                    case "seven":
//                        guessclub = new Card(Card.Suit.CLUBS, Card.Value.SEVEN);
//                        guessheart = new Card(Card.Suit.HEARTS, Card.Value.SEVEN);
//                        guessspade = new Card(Card.Suit.SPADES, Card.Value.SEVEN);
//                        guessdiamond = new Card(Card.Suit.DIAMONDS, Card.Value.SEVEN);
//                        valid = true;
//                        break;
//                    case "eight":
//                        guessclub = new Card(Card.Suit.CLUBS, Card.Value.EIGHT);
//                        guessheart = new Card(Card.Suit.HEARTS, Card.Value.EIGHT);
//                        guessspade = new Card(Card.Suit.SPADES, Card.Value.EIGHT);
//                        guessdiamond = new Card(Card.Suit.DIAMONDS, Card.Value.EIGHT);
//                        valid = true;
//                        break;
//                    case "nine":
//                        guessclub = new Card(Card.Suit.CLUBS, Card.Value.NINE);
//                        guessheart = new Card(Card.Suit.HEARTS, Card.Value.NINE);
//                        guessspade = new Card(Card.Suit.SPADES, Card.Value.NINE);
//                        guessdiamond = new Card(Card.Suit.DIAMONDS, Card.Value.NINE);
//                        valid = true;
//                        break;
//                    case "ten":
//                        guessclub = new Card(Card.Suit.CLUBS, Card.Value.TEN);
//                        guessheart = new Card(Card.Suit.HEARTS, Card.Value.TEN);
//                        guessspade = new Card(Card.Suit.SPADES, Card.Value.TEN);
//                        guessdiamond = new Card(Card.Suit.DIAMONDS, Card.Value.TEN);
//                        valid = true;
//                        break;
//                    case "jack":
//                        guessclub = new Card(Card.Suit.CLUBS, Card.Value.JACK);
//                        guessheart = new Card(Card.Suit.HEARTS, Card.Value.JACK);
//                        guessspade = new Card(Card.Suit.SPADES, Card.Value.JACK);
//                        guessdiamond = new Card(Card.Suit.DIAMONDS, Card.Value.JACK);
//                        valid = true;
//                        break;
//                    case "queen":
//                        guessclub = new Card(Card.Suit.CLUBS, Card.Value.QUEEN);
//                        guessheart = new Card(Card.Suit.HEARTS, Card.Value.QUEEN);
//                        guessspade = new Card(Card.Suit.SPADES, Card.Value.QUEEN);
//                        guessdiamond = new Card(Card.Suit.DIAMONDS, Card.Value.QUEEN);
//                        valid = true;
//                        break;
//                    case "king":
//                        guessclub = new Card(Card.Suit.CLUBS, Card.Value.KING);
//                        guessheart = new Card(Card.Suit.HEARTS, Card.Value.KING);
//                        guessspade = new Card(Card.Suit.SPADES, Card.Value.KING);
//                        guessdiamond = new Card(Card.Suit.DIAMONDS, Card.Value.KING);
//                        valid = true;
//                        break;
//                    default:
//                        System.out.println("Guess invalid, try again. Make sure there are no spaces and all letters are lower case");
//                        valid = false;
//                        break;
//                }
//            }
            
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
        String ans = "";
        Card.Suit suit;
        Card.Value value;
        Card guess = new Card(Card.Suit.CLUBS, Card.Value.ACE);
//        Card guessclub = new Card(Card.Suit.CLUBS, Card.Value.ACE);
//        Card guessheart = new Card(Card.Suit.HEARTS, Card.Value.ACE);
//        Card guessspade = new Card(Card.Suit.SPADES, Card.Value.ACE);
//        Card guessdiamond = new Card(Card.Suit.DIAMONDS, Card.Value.ACE);
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
            p1.getHand().showCards();
            System.out.println("Guess card value: ");
            
            while(valid==false){
                ans = in.next().toUpperCase();
                if(ans.equals("ACE")||ans.equals("TWO")||ans.equals("THREE")||ans.equals("FOUR")||ans.equals("FIVE")||ans.equals("SIX")||
                        ans.equals("SEVEN")||ans.equals("EIGHT")||ans.equals("NINE")||ans.equals("TEN")||ans.equals("JACK")||
                        ans.equals("QUEEN")||ans.equals("KING")){
                    valid = true;
                }else {
                    System.out.println("Guess invalid, try again. Make sure there are no spaces and all letters are lower case");
                    valid = false;
                }
            }
            value = Card.Value.valueOf(ans);
            valid = false;
            
            System.out.println("Guess card suit: ");
            while(valid==false){
                ans = in.next().toUpperCase();
                if(ans.equals("CLUBS")||ans.equals("HEARTS")||ans.equals("SPADES")||ans.equals("DIAMONDS")){
                    valid = true;
                }else{
                    System.out.println("Guess invalid, try again. Make sure there are no spaces and all letters are lower case");
                    valid = false;
                }
            }
            suit = Card.Suit.valueOf(ans);
            valid = false;
            
            
            guess = new Card(suit, value);
            gfa.play(guess, p1, p2);
            p1.addPoint(p1, guess);
            end = gfa.declareWinner(p1, p2, guess);

            if(end==true)
                break;
            

            //player 2's turn, hand is shown and player can guess a card
            System.out.println("Player 2's turn");
            p2.getHand().showCards();
            System.out.println("Guess card value:");
            //loop to check if input is valid
            while(valid==false){
                ans = in.next().toUpperCase();
                if(ans.equals("ACE")||ans.equals("TWO")||ans.equals("THREE")||ans.equals("FOUR")||ans.equals("FIVE")||ans.equals("SIX")||
                        ans.equals("SEVEN")||ans.equals("EIGHT")||ans.equals("NINE")||ans.equals("TEN")||ans.equals("JACK")||
                        ans.equals("QUEEN")||ans.equals("KING")){
                    valid = true;
                }else {
                    System.out.println("Guess invalid, try again. Make sure there are no spaces and all letters are lower case");
                    valid = false;
                }
            }
            value = Card.Value.valueOf(ans);
            valid = false;
            
            System.out.println("Guess card suit: ");
            while(valid==false){
                ans = in.next().toUpperCase();
                if(ans.equals("CLUBS")||ans.equals("HEARTS")||ans.equals("SPADES")||ans.equals("DIAMONDS")){
                    valid = true;
                }else{
                    System.out.println("Guess invalid, try again. Make sure there are no spaces and all letters are lower case");
                    valid = false;
                }
            }
            suit = Card.Suit.valueOf(ans);
            valid = false;
            
            guess = new Card(suit, value);
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
