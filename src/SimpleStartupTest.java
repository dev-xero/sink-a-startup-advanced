public class SimpleStartupTest {
    public static void main(String[] args) {
        SimpleStartup dot = new SimpleStartup();
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
