package cardgame;
/**
 * Starter code for the Card class.
 * To be used in Week 4.
 * 
 */
public class Card {
    
    
        // code is interchangeable and is not tied down to any one program
        // code can be used for any type of deck of cards
        public enum Colour {RED,GREEN,YELLOW,BLUE}
        public enum Rank {ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, SKIP, REVERSE, DRAWTWO, DRAWFOUR, WILDCARD}
        private final Colour colour;
        private final Rank rank;
        
        public Card(Colour s, Rank gVal)
        {
           colour =s;
           rank= gVal;
        }

        /**
         * @return the colour
         */
        public Colour getColour() {
            return colour;
        }

        /**
         * @return the rank
         */
        public Rank getRank() {
            return rank;
        }
	
}