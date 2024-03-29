package Com.Day3;
import java.util.Arrays;

public class SecondLargestNumberArray {
    public static void main(String[] args) {
        
        int arr[] = {2,4,67,91,45,22,100};
        int n = arr.length-1;
        System.out.println("Array is :");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }

        Arrays.sort(arr);
        System.out.println();
        System.out.println("Second Largest Number is : ");
        System.out.println(arr[n-1]);
    }
}