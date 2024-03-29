package Com.FirstDay;
import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int a = scanner.nextInt();
        scanner.close();

        if (a < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else {
            int sum = 0;
            int i = 1;
            StringBuilder expression = new StringBuilder();

            while (i <= a) {
                sum += i;
                expression.append(i);
                if (i < a) {
                    expression.append(" + ");
                }
                i++;
            }

            System.out.println("Sum of first " + a + " natural numbers:");
            System.out.println(expression + " = " + sum);
        }
    }
}
