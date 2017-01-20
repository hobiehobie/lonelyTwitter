package ca.ualberta.cs.lonelytwitter;

/**
 * Created by ahua on 1/19/17.
 */

public class ChillMood extends Mood {
    public ChillMood(String message) {
        super(message);
    }

    @Override
    public String moodType(){
        return "I am feeling CHILLED OUT";
    }
}
