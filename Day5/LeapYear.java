package Day5;
import java.util.Scanner;

public class LeapYear {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the Year : ");
        int year = sc.nextInt();
        String n = String.valueOf(year);

        if(n.length()==4){

            if((year % 4 ==0) && (year % 100 !=0) || (year % 400==0 )){
                System.out.println("This is a leap year ");
            }
            else{
                System.out.println("This is not a leap year ");
            }
        }
        else{
            System.out.println("Enter a valid Input ");
        }

        sc.close();
       
    }
}