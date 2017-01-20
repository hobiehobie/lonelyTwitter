package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by ahua on 1/19/17.
 */

public abstract class Mood {
    /* instance variables */
    private String description;
    private Date date;

    public abstract String moodType();

    /* constructor for user-set date */
    public Mood(Date date, String description){
        this.description = description;
        this.date = date;
    }

    /* constructor for default set date */
    public Mood(String description){
        this.description = description;
        this.date = new Date();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
