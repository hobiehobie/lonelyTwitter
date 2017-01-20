package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by ahua on 1/19/17.
 */

public abstract class Tweet implements Tweetable{
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() > 140){
            throw new TweetTooLongException();
        }
        this.message = message;
    }

    private Date date;
    private String message;

    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }

    public Tweet(Date date, String message){
        this.message = message;
        this.date = date;
    }

    public abstract Boolean isImportant();

}
