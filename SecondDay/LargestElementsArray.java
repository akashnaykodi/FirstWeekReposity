package Com.Day3;
import java.util.*;
public class LargestElementsArray {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();

        System.out.println("Enter Element in array :");
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i] < arr[j]){
                    max = arr[j];
                }
            }
        }

        

        
        System.out.println("Largest Element in Array is : "+max);

        sc.close();
    }
}