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
public class GoFishApp extends Game{
    
    private static ArrayList<Card> deck = new ArrayList<Card>();
    private ArrayList<Player> players = new ArrayList<Player>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //create the deck for the game
        GroupOfCards gc = new GroupOfCards();
        deck = gc.createDeck();
        
        //create players and add them to array list of Players
        
        
        
    }

    public GoFishApp(String gameName, String name) {
        super(gameName, name);
    }

    //does this work?
    @Override
    public void play(Card guess, Player playerTurn, Player playerOther) {
        //call serach method
        boolean valid = false;
        int index;
        for (int i = 0; i < playerOther.getHand().size(); i++) {
             valid = playerOther.getHand().get(i).search(guess);
             if(valid){
                 break;
             }
        }
       
        if (valid) {
            index = playerOther.getHand().indexOf(guess);
            //add card to players hand
            playerTurn.getHand().add(playerOther.getHand().get(index));
            //remove from players hand
            playerOther.getHand().remove(guess);
        }
        else{
            playerTurn.getHand().get(0).draw(deck);
        }

    }

    @Override
    public void declareWinner(Player playerTurn) {
        
        if (playerTurn.getHand().isEmpty()) {
            
            
            
            
            
        }
        
    }
}