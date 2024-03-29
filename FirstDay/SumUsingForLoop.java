package Com.FirstDay;

import java.util.Scanner;

public class SumUsingForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();
        scanner.close();

        if (N < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else {
            int sum = 0;
            StringBuilder expression = new StringBuilder();

            for (int i = 1; i <= N; i++) {
                sum += i;
                expression.append(i);
                if (i < N) {
                    expression.append(" + ");
                }
            }

            System.out.println("Sum of first " + N + " natural numbers:");
            System.out.println(expression + " = " + sum);
        }
    }
}

