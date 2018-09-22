package com.capgemini;


public class Contestant {

    public static int currentID = 1;
    private int id;
    private int health;
    private int attack;
    private int defence;
    private boolean isFemale;

    public Contestant(int health, int attack, int defence, boolean isFemale) {
        this.id = currentID;
        this.health = health;
        this.attack = attack;
        this.defence = defence;
        this.isFemale = isFemale;
        currentID++;
    }
}
