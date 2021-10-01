package employsia.alfred.healthcarereminder.controller;

import java.util.Random;

/**
 * A class that randomize the replying message for certain health feature
 */
public class ReplyRandomizer {

    private static final String[] POSTURES = {
        "you have sitting and working for so long ! It is time to get up and have a stretch !"
    };

    private static final String[] WATERS = {
        "your body must have begging for water ! It is time to get yourself hydrated !"
    };

    public String getPostureMessage() {
        return POSTURES[randInt(0, POSTURES.length)];
    }

    public String getWaterMessage() {
        return WATERS[randInt(0, WATERS.length)];
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
