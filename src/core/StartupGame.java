package core;

import helpers.GameHelper;

import java.util.ArrayList;

public class StartupGame {
    GameHelper helper = new GameHelper();
    ArrayList<Startup> startups = new ArrayList<>();
    int numOfGuesses = 0;
    int numOfKills = 0;

    public void setupGame() {
        System.out.println("Sink-A-Startup");
        System.out.println("How many of these start-ups can you sink with the least number of guesses?");
        System.out.println("\tThe rules are simple, there are three start-ups, each occupying three spaces in a 7x7 grid.");
        System.out.println("\tYour goal is to sink these start-ups with the least number of guesses.");
        System.out.println("\tYou'll have to guess the positions of the start-ups, for example, C3, C4, C5, in order to sink it");
        System.out.println("\tThe game ends when you've sunk all three startups.");
        System.out.println("\tGood luck!");

        startups.add(new Startup("hakki"));
        startups.add(new Startup("table-salt AI"));
        startups.add(new Startup("hard-drive central"));
    }

    public void startPlaying(String userGuess) {
        for (Startup startup : startups) {
            String result = startup.checkYourself(userGuess);
            numOfGuesses++;
            if (result.equals("hit")) {
                System.out.println("Cell " + userGuess + " : hit!");
            } else if (result.equals("kill")) {
                numOfKills++;
                System.out.println("Ouch, you sunk " + startup.name + " !");
                if (numOfKills == 3) {
                    finishGame();
                    break;
                }
            }
        }
    }

    public void finishGame() {
        System.out.println("You've sank all the start-ups, your stocks are now worthless!");
        System.out.println("Heh. Took you long enough, " + numOfGuesses + " guesses.");
    }
}
