package Com.Day3;
import java.util.Scanner;

public class SmallerElementsArray {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter element in array : ");

        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        for(int i=0;i<size-1;i++){
           for(int j=i+1;j<size;j++){

              if(arr[i] > arr[j]){
                min = arr[j];
              }
           }
        }

        System.out.println("Smallest number in array is : "+min);

        sc.close();
    }
}