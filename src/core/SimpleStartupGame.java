package core;

import helpers.GameHelper;

public class SimpleStartupGame {
    public static void main(String[] args) {
        int numOfGuesses = 0;
        int randomNum = (int) (Math.random() * 5);
        int[] locationCells = { randomNum, randomNum + 1, randomNum + 2 };
        boolean isAlive = true;

        GameHelper helper = new GameHelper();
        Startup theStartup = new Startup();

        theStartup.setLocationCells(locationCells);

        while (isAlive) {
            int userGuess = helper.getUserInput("Your guess");
            String result = theStartup.checkYourself(userGuess);
            numOfGuesses++;

            if (result.equals("kill")) {
                isAlive = false;
                System.out.printf("Heh. took you %s attempts!", numOfGuesses);
            }
        }
    }
}
