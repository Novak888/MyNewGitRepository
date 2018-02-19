package BodyOfTheProgram;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Please, introduce yourself.");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello " + scanner.nextLine());
    }
}
