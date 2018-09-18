package com.capgemini;

import java.util.ArrayList;
import java.util.Random;

public class Contestant {

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

        Random random = new Random();

        while (contestantList.size() != HungerGames.AMOUNTCONTESTANTS) {
            contestantList.add(new Contestant(contestantList.size()+1, random.nextInt(150), random.nextInt(15), random.nextInt(15), false));
            contestantList.add(new Contestant(contestantList.size()+1, random.nextInt(150), random.nextInt(15), random.nextInt(15), true));
        }
        return contestantList;
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
}
