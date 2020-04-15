/*
Description: Build the game hand with corresponding
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
     *
     * @param deck
     */
    public void buildHand(ArrayList<Card> deck) {
        for (int i = 0; i < 7; i++) {
            try {
                int num = (int) Math.floor(Math.random() * ((deck.size() - 0 + 1) - 0));
                //add card to players hand
                playersHand.add(deck.get(num));
                //remove card from deck
                deck.remove(num);
            } catch (Exception e) {
                draw(deck);
            }
        }
    }

    /**
     * Take away card from deck and add that card to players hand
     *
     * @param deck
     */
    public void draw(ArrayList<Card> deck) {
        int num = (int) Math.floor(Math.random() * ((deck.size() - 0 + 1) - 0));
        playersHand.add(deck.get(num));
        deck.remove(num);
    }

    /**
     * Search players hand for specified guess
     *
     * @param guess
     * @return
     */
    public int search(String guess) {
        int index = -1;
        for (int i = 0; i < playersHand.size(); i++) {
            if (playersHand.get(i).getValue() == Card.Value.valueOf(guess)) {
                index = i;
            }
        }
        return index;
    }

    public void drawFive(ArrayList<Card> deck) {
        for (int i = 0; i < 5; i++) {
            draw(deck);
        }
    }

    /**
     * Method to display all cards in players hand
     */
    public void showCards() {
        System.out.println("Your current hand");

        for (Card card : playersHand) {
            System.out.println(card.getSuit() + " " + card.getValue());
        }
    }
}
