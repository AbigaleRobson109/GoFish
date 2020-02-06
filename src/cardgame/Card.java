package cardgame;
/**
 * Starter code for the Card class.
 * To be used in Week 4.
 * 
 */
public class Card {
    
    
        // code is interchangeable and is not tied down to any one program
        // code can be used for any type of deck of cards
        public enum Suit {DIAMOND,SPADE,HEART,CLUB}
        public enum Value {ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING}
        private final Suit suit;
        private final Value value;
        
        public Card(Suit s, Value gVal)
        {
           suit =s;
           value= gVal;
        }

        /**
         * @return the suit
         */
        public Suit getSuit() {
            return suit;
        }

        /**
         * @return the value
         */
        public Value getValue() {
            return value;
        }

}