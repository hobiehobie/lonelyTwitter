package ca.ualberta.cs.lonelytwitter;

/**
 * Created by ahua on 1/19/17.
 * NostalgicMood is a subclass of Mood
 * returns a string expressing nostalgic mood
 */

public class NostalgicMood extends Mood {
    public NostalgicMood(String description) {
        super(description);
    }


    @Override
    public String moodType(){
        return "ahh I miss the old days";
    }
}
