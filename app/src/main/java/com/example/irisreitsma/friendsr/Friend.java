package com.example.irisreitsma.friendsr;

import java.io.Serializable;

/**
 * Created by Iris Reitsma on 26-2-2018.
 */

public class Friend implements Serializable {

    // properties of the class
    private String name, bio;
    private int drawableId;
    private float rating;

    // constructor of the class
    public Friend(String name, String bio, int drawableId) {
        this.name = name;
        this.bio = bio;
        this.drawableId = drawableId;
    }

    // getters
    public String getName() {
        return name;
    }
     public String getBio() {
        return bio;
    }
    public int getDrawableId() {
        return drawableId;
    }
    public float getRating() {
        return rating;
    }

    // setter for rating
    public void setRating(float rating) {
        this.rating = rating;
    }
}
