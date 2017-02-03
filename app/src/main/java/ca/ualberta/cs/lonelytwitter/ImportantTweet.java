package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by ahua on 1/19/17.
 * ImportantTweet is a subclass of Tweet
 * It is possible to include the date or not include the date
 * Keeps instance variables of message and date
 * isImportant() returns true
 */

public class ImportantTweet extends Tweet {
    public ImportantTweet(String message) {
        super(message);
    }

    public ImportantTweet(Date date, String message) {
        super(date, message);
    }

    @Override
    public Boolean isImportant(){
        return true;
    }
}
