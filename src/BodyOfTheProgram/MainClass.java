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

    }
}
