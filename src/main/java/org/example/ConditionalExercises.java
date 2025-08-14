package org.example;

public class ConditionalExercises {

    public boolean lessThanFive(int number) {
        if (number < 5) {
            return true;
        } else {
            return false;
        }
    }

    public String getAgeGroup(int age) {
        if (age >= 0 && age <= 12) {
            return "Child";
        } else if (age >= 13 && age <= 19) {
            return "Teen";
        } else {
            return "Adult";
        }
    }

    public boolean isValidPassword(String password) {
        if (password.length() >= 8) {
            return true;
        } else {
            return false;
        }
    }
}
