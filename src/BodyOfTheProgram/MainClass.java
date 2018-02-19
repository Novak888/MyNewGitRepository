package BodyOfTheProgram;

import java.util.Scanner;

public class MainClass {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please, introduce yourself.");


        System.out.println("Hello " + scanner.nextLine());

        System.out.println("If you wont to add, enter yes.");
        String answer = scanner.nextLine();
        if (answer.equals("yes")) {
            Add add = new Add();
            System.out.println("Enter two numbers.");
            add.adding(scanner.nextInt(), scanner.nextInt());
        } else {
            System.out.println("Bye!");
        }
        System.out.println("The resulting number can be divided, if you want to enter a number.");
        int division = scanner.nextInt();
        Division divisions = new Division();
        divisions.division(division);

    }
}
