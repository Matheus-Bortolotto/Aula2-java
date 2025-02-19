package org.example;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for grades
        System.out.print("Enter the value of Grade 1: ");
        double grade1 = scanner.nextDouble();

        System.out.print("Enter the value of Grade 2: ");
        double grade2 = scanner.nextDouble();

        System.out.print("Enter the value of the project: ");
        double project = scanner.nextDouble();

        // Calculate final grade
        double finalGrade = (grade1 * 0.4) + (grade2 * 0.4) + (project * 0.2);

        // Display the result
        System.out.println("The final grade is: " + finalGrade);

        if (finalGrade >= 7) {
            System.out.println("You passed.");
        } else {
            System.out.println("You need to take an exam.");

            double examGrade = (10 - finalGrade) / 2;

            if (examGrade == 5) {
                System.out.println("You passed.");
            } else {
                System.out.println("You failed.");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
