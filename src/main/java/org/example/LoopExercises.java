package org.example;

public class LoopExercises {

    public int sum(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i;
        }
        return total;
    }

    public int sumUntilEven(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                break; // stop when even number is reached
            }
            total += i;
        }
        return total;
    }
}
