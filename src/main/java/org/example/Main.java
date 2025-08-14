package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ConditionalExercises ce = new ConditionalExercises();
        LoopExercises le = new LoopExercises();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter any number : ");
        int num = input.nextInt();
        System.out.println(ce.lessThanFive(num));

        System.out.println("Enter your age : ");
        int age = input.nextInt();
        System.out.println(ce.getAgeGroup(age));

        System.out.println("Enetr your password : ");
        String password = input.next();
        System.out.println( ce.isValidPassword(password));


        System.out.println("Enter any digit :");
        int num1 = input.nextInt();
        System.out.println("sum(number): " + le.sum(num1));
        System.out.println("sumUntilEven(num): " + le.sumUntilEven(num1));
    }
}
