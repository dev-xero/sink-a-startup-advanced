class SimpleStartUp {
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

public class SimpleStartupTestDrive {
    public static void main(String[] args) {
        SimpleStartUp dot = new SimpleStartUp();
        String testResult = "failed";

        int guess = 3;
        int[] locations = {1, 2, 3};
        dot.setLocationCells(locations);

        String result = dot.checkYourself(guess);

        if (result.equals("hit")) {
            testResult = "passed";
        }

        System.out.printf("Test Result: %s", testResult);
    }
}
