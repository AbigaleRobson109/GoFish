/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the
 * code should remember to add themselves as a modifier.
 *
 * @author dancye, 2018
 */
public class Card {

    public enum Suit {
        HEARTS, SPADES, CLUBS, DIAMONDS
    };

    public enum Value {
        ACE, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK,
        QUEEN, KING
    };
    private final Suit suit;
    private final Value value;
    
    /**
     * Set values of suit and value constructor
     *
     * @param c
     * @param v
     */
    public Card(Suit c, Value v) {
        suit = c;
        value = v;
    }

    /**
     * Get the value of specified Value
     *
     * @return
     */
    public Value getValue() {
        return this.value;
    }

    /**
     * Get the value of specified suit
     *
     * @return
     */
    public Suit getSuit() {
        return this.suit;
    }

    /**
     * String format to display suit and value
     *
     * @return
     */
    @Override
    public String toString() {
        return suit.name() + " " + value.name();
    }

}
