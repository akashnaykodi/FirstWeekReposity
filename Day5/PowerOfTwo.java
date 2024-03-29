package Day5;
import java.util.Scanner;

public class PowerOfTwo {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();

        System.out.println("Power of two is :");
        if(n>=0 && n<31){
            for(int i=0;i<=n;i++){
                System.out.println(Math.pow(2,i));
            }
        }
        else{
            System.out.println("Invalid input");
        }

        sc.close();
    }
}