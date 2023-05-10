package core;

public class SimpleStartup {
    private int[] locationCells;
    public int numOfHits = 0;

    public void setLocationCells(int[] cellLocations) {
        locationCells = cellLocations;
    }

    public String checkYourself(int guess) {
        String result = "miss";

        for (int cell : locationCells) {
            if (guess == cell) {
                result = "hit";
                numOfHits++;
                break;
            }

        }

        if (numOfHits == locationCells.length) {
            result = "kill";
        }

        System.out.println(result);

        return result;
    }

}
