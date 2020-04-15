/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * A class that models each Player in the game. Players have an identifier,
 * which should be unique.
 *
 * @author dancye, 2018
 */
public class Player {

    private String playerID; //the unique ID for this player
    private Hand hand;
    private int points;

    /**
     * A constructor that allows you to set the player's unique ID
     *
     * @param name the unique ID to assign to this player.
     */
    public Player(String name) {
        hand = new Hand();
        playerID = name;
        points = 0;
    }

    /**
     * @return the playerID
     */
    public String getPlayerID() {
        return playerID;
    }

    /**
     * Ensure that the playerID is unique
     *
     * @param givenID the playerID to set
     */
    public void setPlayerID(String givenID) {
        playerID = givenID;
    }

    public Hand getHand() {
        return hand;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    /**
     * The method to be instantiated when you subclass the Player class with
     * your specific type of Player and filled in with logic to play your game.
     */
    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public void addPoint(Player player, String guess) {
        int num = 0;
        int[] index = new int[4];
        for (int i = 0; i < player.getHand().getPlayersHand().size(); i++) {
            if (player.getHand().getPlayersHand().get(i).getValue() == Card.Value.valueOf(guess)) {
                index[num] = i;
                num += 1;
            }
        }
        if (num == 4) {
            for (int j = 0; j < 4; j++) {
                player.getHand().getPlayersHand().remove(index[j]);
                points++;
            }
        }
    }
}
