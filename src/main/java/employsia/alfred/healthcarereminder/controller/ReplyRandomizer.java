package employsia.alfred.healthcarereminder.controller;

import java.util.Random;

/**
 * A class that randomize the replying message for certain health feature
 */
public class ReplyRandomizer {

    private static final String[] POSTURES = {
        "you have sitting and working for so long ! It is time to get up and have a stretch !",
        "maybe it is time to leave your sit and move your body after your hard work ?",
        "working hard is great while also don't forget to stretch after awhile!"
    };

    private static final String[] WATERS = {
        "your body must have begging for water ! It is time to get yourself hydrated !",
        "drinking some water can not only make yourself refreshing, but also makes you healthier !",
        "our human body consists up to 70% of water, thus you may need to refill it now!"
    };

    public String getPostureMessage(String username) {
        return "Hey " + username + ", " + POSTURES[randInt(0, POSTURES.length)];
    }

    public String getWaterMessage(String username) {
        return "Hey " + username + ", " + WATERS[randInt(0, WATERS.length)];
    }

    /**
     * Generate a random integers within a given range
     * Reference : https://stackoverflow.com/questions/363681/how-do-i-generate-random-integers-within-a-specific-range-in-java
     * @param min
     * @param max
     * @return
     */
    public static int randInt(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max - min)) + min;
    }
}
