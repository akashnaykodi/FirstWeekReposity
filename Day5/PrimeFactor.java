package Day5;
import java.util.Scanner;

public class PrimeFactor {

  
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = sc.nextInt();

        for(int i=2;i<n;i++){
            while(n % i ==0){
                System.out.println(i+ " ");
                n = n/i;
            }    
        }
        
        if(n >2){
            System.out.println(n);
        }

        sc.close();
    }
    
}