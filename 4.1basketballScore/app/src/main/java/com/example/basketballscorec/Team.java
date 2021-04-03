package com.example.basketballscorec;

/**
 * Creates Team class
 */

public class Team {

    // declares and initialize variables for scoring.
    static private final int THREE_POINTS = 3;
    static private final int BASKET = 2;
    static private final int FREE_THROW = 1;

    // declares variables for object
    private int mScore;
    private String mName;

    // constructor method to create Team object.
    Team(int score, String name) {
        mScore = score;
        mName = name;
    }

    // mutator. allows name to be set.
    public void setName(String name) {
        mName = name;
    }

    // accessor. allows name to be accessed.
    public String getName() {
        return mName;
    }

    // mutator. allows score to be set.
    public void setScore(int score) {
        mScore = score;
    }

    // accessor. allows score to get accessed.
    public int getScore() {
        return mScore;
    }

    // method to score three points
    void threePoints() {
        mScore += THREE_POINTS;
    }

    // method to score two points.
    void basket() {
        mScore += BASKET;
    }

    // method to score one point.
    void freeThrow() {
        mScore += FREE_THROW;
    }

}