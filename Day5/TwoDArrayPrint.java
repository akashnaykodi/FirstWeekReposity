package Day5;
import java.util.*;
public class TwoDArrayPrint {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a value of m : ");
        int m = sc.nextInt();

        System.out.println("Enter a value of n : ");
        int n = sc.nextInt();

        int arr[][] = new int[10][10];
        int elements = m*n;

        System.out.println("Enter element "+elements +" in array : ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[m][n] = sc.nextInt();
            }
        }

        System.out.println("The 2D array is : ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.println(arr[m][n] + " ");
            }
        }

        sc.close();

    }
}

