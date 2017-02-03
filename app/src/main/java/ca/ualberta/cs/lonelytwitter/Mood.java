package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by ahua on 1/19/17.
 * The mood class has subclasses ChillMood and NostalgicMood
 * It keeps instance variables of description and date
 */

public abstract class Mood {
    /* instance variables */
    private String description;
    private Date date;
    public abstract String moodType();

    /**
     *  constructor for user-set date
     */
    public Mood(Date date, String description){
        this.description = description;
        this.date = date;
    }

    /**
     *  constructor for default set date
     */
    public Mood(String description){
        this.description = description;
        this.date = new Date();
    }

    /**
     * getter for the date
     * @return date
     */
    public Date getDate() {
        return date;
    }

    /**
     * setter for the date
     * @param date that the user would like to set
     */
    public void setDate(Date date) {
        this.date = date;
    }
}
