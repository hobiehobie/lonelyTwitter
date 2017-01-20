package ca.ualberta.cs.lonelytwitter;

/**
 * Created by ahua on 1/19/17.
 */

public class NostalgicMood extends Mood {
    public NostalgicMood(String description) {
        super(description);
    }


    @Override
    public String moodType(){
        return "I am feeling nostalgic";
    }
}
