package Com.FirstDay;

import java.util.Scanner;

public class NumberToWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a single digit number: ");
        int number = scanner.nextInt();
        scanner.close();

        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

        if (number >= 0 && number <= 9) {
            System.out.println("In words: " + words[number]);
        } else {
            System.out.println("Invalid input! Please enter a single digit number.");
        }
    }
}