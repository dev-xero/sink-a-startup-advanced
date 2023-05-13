package tests;

import core.Startup;

import java.util.ArrayList;

public class SimpleStartupTest {
    public static void main(String[] args) {
        Startup dot = new Startup();
        String testResult = "failed";

        int guess = 3;
        ArrayList<String> locations = new ArrayList<String>("1", "2", "3");
        dot.setLocationCells(locations);

        String result = dot.checkYourself(guess);

        if (result.equals("hit")) {
            testResult = "passed";
        }

        System.out.printf("Test Result: %s", testResult);
    }
}
