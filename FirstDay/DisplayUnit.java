package Com.FirstDay;
import java.util.Scanner;

public class DisplayUnit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (1, 10, 100, 1000): ");
        int number = scanner.nextInt();
        scanner.close();

        if (number == 1) {
            System.out.println("Units: " + 1);
        } else if (number == 10) {
            int units = number % 10;
            int tens = number / 10;
            System.out.println("Units: " + units);
            System.out.println("Tens: " + tens);
        } else if (number == 100) {
            int units = number % 10;
            int tens = (number / 10) % 10;
            int hundreds = number / 100;
            System.out.println("Units: " + units);
            System.out.println("Tens: " + tens);
            System.out.println("Hundreds: " + hundreds);
        } else if (number == 1000) {
            int units = number % 10;
            int tens = (number / 10) % 10;
            int hundreds = (number / 100) % 10;
            int thousands = number / 1000;
            System.out.println("Units: " + units);
            System.out.println("Tens: " + tens);
            System.out.println("Hundreds: " + hundreds);
            System.out.println("Thousands: " + thousands);
        } else {
            System.out.println("Not allowed Please enter 1, 10, 100,1000.");
        }
    }
}
