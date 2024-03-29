package Com.Day3;
import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size in array");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter element a  in array :");

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Array is :");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }

        Arrays.sort(arr);
        System.out.println("Sorted Array is : ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}