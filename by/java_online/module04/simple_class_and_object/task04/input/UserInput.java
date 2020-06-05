package by.java_online.module04.simple_class_and_object.task04.input;

import java.util.Scanner;

public class UserInput {
    public int enterTrainNumber(String message) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        int userRequest;

        System.out.println(message);
        while (!input.hasNextInt()) {
            input.nextLine();
            System.out.println("Wrong format. Try again.");
        }
        userRequest = input.nextInt();

        return userRequest;
    }
}