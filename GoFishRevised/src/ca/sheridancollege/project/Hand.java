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
    
    private ArrayList<Card> playersHand;
     
    public Hand() {
        playersHand = new ArrayList<Card>();
    }

    public ArrayList<Card> getPlayersHand() {
        return playersHand;
    }

    public void setPlayersHand(ArrayList<Card> playersHand) {
        this.playersHand = playersHand;
    }
    
    
    /**
     * create a hand for start of the game
     * @param deck     */
    public void buildHand(ArrayList<Card> deck) {
        for (int i = 0; i < 7; i++) {
            int num = (int) (Math.random() * ((deck.size() - 0 + 1) - 0));
            //add card to players hand
            playersHand.add(deck.get(num));
            //remove card from deck
            deck.remove(num);
        }
    }
    
     /**
     * Take away card from deck and add that card to players hand
     * @param deck
     */
    public void draw(ArrayList<Card> deck){
        int num = (int) (Math.random() * ((deck.size() - 0 + 1) - 0));
        playersHand.add(deck.get(num));
        deck.remove(num);
    }
    
     /**
     * Search players hand for specified guess
     * @param guess
     * @return
     */
    public boolean search(Card guess){
        return playersHand.contains(guess);
    }
    
    public void drawFive(ArrayList<Card> deck){
        for (int i = 0; i < 5; i++) {
            draw(deck);
        }
    }
    
    /**
     * Method to display all cards in players hand
     */
    public void showCards(){
        System.out.println("Your current hand");

        for (Card card : playersHand) {
            System.out.println(card.getValue() + " of " + card.getSuit());
        }
    }
}
