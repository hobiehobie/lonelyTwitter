package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

/**
 * Created by ahua on 2/16/17.
 */

public class TweetList {
    private ArrayList<NormalTweet> tweets = new ArrayList<NormalTweet>();

    public void add(NormalTweet tweet) {
        if(DuplicateTweetCheck(tweet)){
            throw new IllegalArgumentException("Duplicate tweet cannot be added!");
        } else {
            tweets.add(tweet);
        }
    }

    public boolean hasTweet(NormalTweet tweet) {
        return tweets.contains(tweet);
    }

    public NormalTweet getTweet(int index){
 //       return new NormalTweet("not the tweet");
        return tweets.get(0);
    }

    public void delete(NormalTweet tweet) {
        tweets.remove(tweet);
    }

    public boolean DuplicateTweetCheck(NormalTweet tweet){
        for (NormalTweet item : tweets) {
            if (item.getMessage().equals(tweet.getMessage())){
                return true;
            }
        }
        return false;
    }
}
