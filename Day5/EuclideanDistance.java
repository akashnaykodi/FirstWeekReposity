package Day5;
import java.util.Scanner;

public class EuclideanDistance {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a value of X :");
        int x = sc.nextInt();

        System.out.println("Enter a value of Y :");
        int y = sc.nextInt();

        double distance = (Math.sqrt(x*x + y*y));
        System.out.println(distance);

        sc.close();
    }
}