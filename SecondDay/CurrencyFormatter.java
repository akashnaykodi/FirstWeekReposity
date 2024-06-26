package Com.Day3;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double payment  = sc.nextDouble();

        Locale INDIA = new Locale("en", "IN");

        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String india = NumberFormat.getCurrencyInstance(INDIA).format(payment);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

        System.out.println("US : " +us);
        System.out.println("INDIA : " +india);
        System.out.println("CHINA : " +china);
        System.out.println("FRANCE : " +france);

        sc.close();
    }
}