package Day5;
import java.util.Scanner;

public class HarmonicNumber {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        double result = 0.0;


        if(number!=0){

            while(number>0){
                result = result + (double)1/number;
                number --;
            }
        }
        System.out.println("The Harmonic number series :"+result);
        sc.close();
        
    }
}