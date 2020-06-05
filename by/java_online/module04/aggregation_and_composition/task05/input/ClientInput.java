package by.java_online.module04.aggregation_and_composition.task05.input;

import java.util.Scanner;

public class ClientInput {
    public int enterNumber(int maxNumber) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        boolean condition;
        int number;

        condition = false;
        number = -1;

        while (!condition) {
            System.out.println("Enter your number ->");
            while (!input.hasNextInt()) {
                input.nextLine();
                System.out.println("Wrong input. Try again.");
            }
            number = input.nextInt();

            if (number >= 0 && number <= maxNumber) {
                condition = true;
            } else {
                System.out.println("Number shouldn't be greater than " + maxNumber + ". Try again.");
            }
        }

        return number;
    }
}
