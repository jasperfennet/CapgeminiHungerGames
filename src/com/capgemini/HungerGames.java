package com.capgemini;

import java.util.ArrayList;
import java.util.Random;

public class HungerGames {
    public static final int AMOUNTCONTESTANTS = 24;
    public static final int FIGHTCYCLES = 2;
    private static Random random = new Random();
    private ArrayList<Contestant> contestants;

    public HungerGames() {
        this.contestants = new ArrayList<Contestant>();
        this.contestants = Contestant.generateContestants(contestants);
    }

    public ArrayList<Contestant> getContestants() {
        return contestants;
    }



    public void fightCycle() {
        int damage;

        if (getContestants().size() == 1) {
            System.out.printf("Winner Hungergames is Contestant %d\n", getContestants().get(0).getId());
        } else {

            Contestant contestantOne = getContestants().get(random.nextInt(getContestants().size()));
            Contestant contestantTwo = getContestants().get(random.nextInt(getContestants().size()));

            System.out.printf("Look!! A fight is starting\n");
            damage = contestantOne.attack();
            System.out.printf("Contestant %d Attacks Contestant %d with a damage of %d\n", contestantOne.getId(), contestantTwo.getId(), damage);
            contestantTwo.takeDamage(damage);

            if (contestantTwo.isDead()) {
                contestants.remove(contestantTwo);
                System.out.printf("Contestant %d killed Contestant %d, %d Contestants left.\n", contestantOne.getId(), contestantTwo.getId(), contestants.size());
            } else {
                System.out.printf("Contestant %d now has %d health left.\n", contestantTwo.getId(), contestantTwo.getHealth());

                damage = contestantTwo.attack();
                System.out.printf("Contestant %d Attacks Contestant %d with a damage of %d\n", contestantTwo.getId(), contestantOne.getId(), damage);
                contestantOne.takeDamage(damage);
            }

            if (contestantOne.isDead()) {
                contestants.remove(contestantOne);
                System.out.printf("Contestant %d killed Contestant %d, %d Contestants left.\n", contestantTwo.getId(), contestantOne.getId(), contestants.size());
            } else {
                System.out.printf("Contestant %d now has %d health left.\n", contestantTwo.getId(), contestantTwo.getHealth());
            }
        }
    }
}
