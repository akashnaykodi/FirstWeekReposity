package Day5;
import java.util.Scanner;

public class Quadratic {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value of a : ");
        int a = sc.nextInt();
        System.out.println("Enter a value of b : ");
        int b = sc.nextInt();
        System.out.println("Enter a value of c : ");
        int c = sc.nextInt();

        

        System.out.println("Find the root of equation : ");
        int delta = b*b - 4*a*c;

        
            int rootx1 = (int)(-b + Math.sqrt(delta)/ (2*a));
            int rootx2 = (int)(-b - Math.sqrt(delta)/ (2*a));

            System.out.println("The root 1 is :"+ rootx1);
            System.out.println("The root 2 is :"+ rootx2);
        
        sc.close();
        

        
    }
}