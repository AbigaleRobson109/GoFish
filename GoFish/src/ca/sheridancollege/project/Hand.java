/*
        PROG 24178
        Author: [the name of the person who created the class. It might be different from yours]
        Date: [date]

        Description
        [Description about the class]
    */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 *
 * @author abiga
 */
public class Hand {
    //represnts the playeres hand
    private ArrayList<Card> playersHand;
    
    //represent the deck of cards
    private ArrayList<Card> cards;
   
    /**
     * Default Constructor
     * @param cards 
     */
    public Hand() {
       
    }
    
    /**
     * create a hand for start of the game
     * @param c 
     */
    private void buildHand(ArrayList<Card> c){
        //will take 7 cards from the deck and add them to the array list
        
        for (int i = 0; i < 7; i++) {
            //generate random number
            int num = (int) Math.random() * ((c.size() - 0 + 1) - 0);
            //add card index to players hand
            playersHand.add(c.get(num));
            //remove that number for deck
            c.remove(num);
        }
        
    }
    /**
     * Take away card from deck and add that card to players hand
     * @param c 
     */
    private void draw(ArrayList<Card> c){
            //generate random number
            int num = (int) Math.random() * ((c.size() - 0 + 1) - 0);
            //add card index to players hand
            playersHand.add(c.get(num));
            //remove that number for deck
            c.remove(num);
    }
    
    /**
     * Search players hand 
     * @param guess
     * @return 
     */
    private boolean search(Card guess){
        return playersHand.contains(guess);
    }  
    /**
     * Method to display all cards in players hand
     */
    public void showCards(){
        System.out.println("Your current hand");
        
        for (Card card : playersHand) {
            System.out.println("/n" + card.getSuit() + " " + card.getValue());
        }
    }

}
