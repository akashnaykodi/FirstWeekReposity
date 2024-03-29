package Day5;
import java.util.Scanner;

public class LarestFromThreeNumbers {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first number :");
        int  num1 = sc.nextInt();
        System.out.println("Enter a second number :");
        int num2 = sc.nextInt();
        System.out.println("Enter the third number :");
        int num3 = sc.nextInt();

        if(num1 > num2 && num1 > num3){
             System.out.println("Number 1 is Greater : " +num1);
        }
        else if(num2 > num1 && num2 > num3){
            System.out.println("Number 2 is Greater : " +num2);
        }
        else{
            System.out.println("Number 3 is Greater : " +num3);
        }

        sc.close();
    }
}