package com.capgemini;

public class FightCycle {

    private Contestant contestantOne;
    private Contestant contestantTwo;

    public FightCycle(Contestant contestantOne, Contestant contestantTwo) {
        this.contestantOne = contestantOne;
        this.contestantTwo = contestantTwo;
    }

    public Contestant battle() {
        Contestant battleLoser;
        Contestant battleWinner;

        if (contestantOne.getAttack() > contestantTwo.getDefence()) {
            battleLoser = contestantTwo;
            battleWinner = contestantOne;
        } else {
            battleLoser = contestantTwo;
            battleWinner = contestantOne;
        }
        System.out.printf("*** Conestant %d killed Contestant %d \n", battleLoser.getId(), battleWinner.getId());
        return battleLoser;
    }
}
