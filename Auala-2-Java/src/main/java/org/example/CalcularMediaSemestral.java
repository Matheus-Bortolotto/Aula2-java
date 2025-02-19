package org.example;

import java.util.Scanner;

public class CalcularMediaSemestral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get PCC%F and GS values from the user
        System.out.print("Enter the PCC%F value: ");
        double pccf = scanner.nextDouble();

        System.out.print("Enter the GS value: ");
        double gs = scanner.nextDouble();

        // Calculation of MS1
        double ms1 = (pccf * 0.4) + (gs * 0.6);

        // Display the result
        System.out.println("The value of MS1 is: " + ms1);

        // Close the scanner
        scanner.close();
    }
}
