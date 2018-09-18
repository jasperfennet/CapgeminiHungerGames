package com.capgemini;

import java.util.ArrayList;

public class HungerGames {
    public static final int AMOUNTCONTESTANTS = 24;
    public static final int FIGHTCYCLES = 2;

    private ArrayList<Contestant> contestants;


    public HungerGames() {
        this.contestants = new ArrayList<Contestant>();
        this.contestants = Contestant.generateContestants(contestants);
    }

    public ArrayList<Contestant> getContestants() {
        return contestants;
    }
}
