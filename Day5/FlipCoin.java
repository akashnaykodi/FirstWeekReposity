package Day5;
import java.util.Scanner;

public class FlipCoin {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        int count = 0;
        int count1 = 0;
        int count2 = 0;

        if(num>0){
            
            while (count<=num) {
                
                if(Math.random()<0.5){

                    count2 += 1;
                }
                else{
                    count1 += 1;
                }
                count ++;
            }

            double tails = ((double)count2 / num) * 100;
            double heads = ((double)count1 / num )* 100;

            System.out.println("Tails Flip % is :" + tails);
            System.out.println("Head Flip % is : "+heads);
        }
        else{
            System.out.println("Invalid Number");
        }

        sc.close();
    }
}