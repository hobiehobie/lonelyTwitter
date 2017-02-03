package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by ahua on 1/19/17.
 * NormalTweet is a subclass of Tweet
 * It is possible to have a NormalTweet with or without a date
 * Keeps instance variables of date and message and
 * isImportant() returns false
 */

public class NormalTweet extends Tweet {
    public NormalTweet(String message) {
        super(message);
    }

    public NormalTweet(Date date, String message) {
        super(date, message);
    }

    @Override
    public Boolean isImportant(){
        return false;
    }
}
