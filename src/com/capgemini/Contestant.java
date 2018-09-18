package com.capgemini;

import java.util.ArrayList;
import java.util.Random;

public class Contestant implements Fight {

    private static Random random = new Random();


    private int id;
    private int health;
    private int attack;
    private int defence;
    private boolean isFemale;

    public Contestant(int id, int health, int attack, int defence, boolean isFemale) {
        this.id = id;
        this.health = health;
        this.attack = attack;
        this.defence = defence;
        this.isFemale = isFemale;
    }

    public static ArrayList<Contestant> generateContestants(ArrayList<Contestant> contestantList) {

        while (contestantList.size() != HungerGames.AMOUNTCONTESTANTS) {
            contestantList.add(new Contestant(contestantList.size() + 1, random.nextInt(150)+1, random.nextInt(15)+1, random.nextInt(15)+1, false));
            contestantList.add(new Contestant(contestantList.size() + 1, random.nextInt(150)+1, random.nextInt(15)+1, random.nextInt(15)+1, true));
        }
        return contestantList;
    }

    public boolean isDead() {
        return health <= 0;
    }

    public int getId() {
        return id;
    }

    public int getHealth() {
        return health;
    }

    @Override
    public String toString() {
        return "Contestant{" +
                "id=" + id +
                ", health=" + health +
                ", attack=" + attack +
                ", defence=" + defence +
                ", isFemale=" + isFemale +
                '}';
    }

    @Override
    public int attack() {
        int damage = attack + (random.nextInt(attack)/ 2);
        return damage;
    }

    @Override
    public int heal() {
        int healing = defence + (random.nextInt((defence) / 2));
        health += healing;
        return healing;
    }

    @Override
    public void takeDamage(int damage) {
        health -= damage;
    }
}