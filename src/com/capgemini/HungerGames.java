package com.capgemini;

import java.util.ArrayList;
import java.util.Random;

public class HungerGames {

    public static final int AMOUNTCONTESTANTS = 24;
    private ArrayList<Contestant> contestants;

    public HungerGames() {
        generateContestants();
        start();
    }

    private void start() {
        printIntroHungergames();
        beginBattles();

    }

    private void beginBattles(){
        while(contestants.size() != 1){
            FightCycle fightCycle = new FightCycle(getRandomContestant(), getRandomContestant());
            contestants.remove(fightCycle.battle());
            System.out.println(contestants.size());
        }
        printHungerGamesWinner();

    }

    private void printHungerGamesWinner() {
        System.out.println("*** All other contestants killed");
        System.out.printf("*** Hunger Games winner is contestant %d", contestants.get(0).getId());
    }

    public ArrayList<Contestant> getContestants() {
        return contestants;
    }

    public void generateContestants() {
        Random random = new Random();

        this.contestants = new ArrayList<Contestant>();

        while (this.contestants.size() != HungerGames.AMOUNTCONTESTANTS) {
            this.contestants.add(new Contestant(random.nextInt(150), random.nextInt(15), random.nextInt(15), false));
            this.contestants.add(new Contestant(random.nextInt(150), random.nextInt(15), random.nextInt(15), true));
        }
    }

    public Contestant getRandomContestant(){
        Random random = new Random();
        return contestants.get(random.nextInt(contestants.size()));

    }
    public void printIntroHungergames() {
        System.out.printf("*** This year's Hunger Games contains %s contestants.\n", contestants.size());
        System.out.printf("*** During this years hunger games we let contestants fight untill we have a winner.\n");
        System.out.printf("*** In a single fight cycle a contestant gets to attack and defence once, unless a user is killed before defence state.\n");
    }
}
