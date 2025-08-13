package org.example;

public class ConditionalExercises {
    public boolean lessThanFive(int x) {
        // Replace the line below with code that returns true if x is less than 5, and false otherwise
        // (use an if statement with an else block.)
        return x < 5;
    }

    public String getAgeGroup(int age) {
        // Replace the line below with code that returns "child" if age is less than 13,
        if (age < 13) {
            return "child";
        } else if (age < 20) {
            return "teen";
        } else {
            return "adult";
        }
        // "teen" if age is less than 20, and "adult" otherwise
        // (use if, else if, and else)

    }

    public boolean isValidPassword(String password) {
        int passwordLength = password.length();
            return passwordLength >= 8;

    }
}
        // Replace the line below with code that returns true if password is at least 8 characters long
        // and false otherwise
        // (use an if statement with an else block.)

