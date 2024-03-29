package Day5;
import java.util.Scanner;

public class QuotientRemainder {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter divident :");
        int divident = sc.nextInt();
        System.out.println("Enter divisor :");
        int divisor = sc.nextInt();


        int quotient = divident / divisor;
        int reminder = divident % divisor;

        System.out.println("The Quotient is : "+ quotient);
        System.out.println("The Reminder is : "+ reminder);
        sc.close();
    }
}