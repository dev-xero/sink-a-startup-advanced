package tests;

import core.Startup;

import java.util.ArrayList;

public class StartupTest {
    public static void main(String[] args) {
        Startup dot = new Startup("dot");
        String testResult = "failed";
        ArrayList<String> locations = new ArrayList<>();

        locations.add("A0");
        locations.add("A1");
        locations.add("A2");

        dot.setLocationCells(locations);
        String guess = "A1";

        String result = dot.checkYourself(guess);

        if (result.equals("hit")) {
            testResult = "passed";
        }

        System.out.printf("Test Result: %s", testResult);
    }
}
