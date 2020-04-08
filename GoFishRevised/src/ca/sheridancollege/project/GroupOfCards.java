/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you
 * might want to subclass this more than once. The group of cards has a maximum
 * size attribute which is flexible for reuse.
 *
 * @author dancye
 */
public class GroupOfCards {

    //The group of cards, stored in an ArrayList
    private ArrayList<Card> cards;

    /**
     * Default Constructor
     */
    public GroupOfCards() {
        cards = new ArrayList<Card>();
    }
    /**
     * Return the value of the card with suit and rank
     * @return
     */
    public ArrayList<Card> getCards() {
        return cards;
    }

    /**
     * Method that creates the group of cards as an ArrayList
     * @return 
     */
    public ArrayList<Card> createDeck() {
        for (Card.Suit c : Card.Suit.values()) {
            for (Card.Value v : Card.Value.values()) {
                cards.add(new Card(c, v));
            }
        }
        return cards;
    }
}//end class
