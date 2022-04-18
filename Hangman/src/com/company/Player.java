package com.company;

public class Player {


    private String name;
    private int numWin;
    private int playCount;
    private int maxLevel;

    public Player(String name, int numWin, int playCount, int maxLevel) {
        this.name = name;
        this.numWin = numWin;
        this.playCount = playCount;
        this.maxLevel = maxLevel;
    }

    public Player() {
       maxLevel=1;
        playCount=0;
        numWin=0;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumWin() {
        return numWin;
    }

    public void setNumWin(int numWin) {
        this.numWin = numWin;
    }

    public int getPlayCount() {
        return playCount;
    }

    public void setPlayCount(int playCount) {
        this.playCount = playCount;
    }

    public int getMaxLevel() {
        return maxLevel;
    }

    public void setMaxLevel(int maxLevel) {
        this.maxLevel = maxLevel;
    }



}
