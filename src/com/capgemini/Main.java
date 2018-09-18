package com.capgemini;

public class Main {

    public static void main(String[] args) {
        HungerGames hungerGames = new HungerGames();
        printIntroHungergames(hungerGames);



    }

    public static void printIntroHungergames(HungerGames hungerGames){
        System.out.printf("*** This year's Hunger Games contains %s contestants.\n", hungerGames.getContestants().size());
        System.out.printf("*** During this years hunger games we let contestants fight untill we have a winner.\n");
        System.out.printf("*** There are a total of %d fight cycles each day. \n", HungerGames.FIGHTCYCLES);
        System.out.printf("*** In a single fight cycle a contestant gets to attack and defence once, unless a user is killed before defence state.\n");
    }
}
