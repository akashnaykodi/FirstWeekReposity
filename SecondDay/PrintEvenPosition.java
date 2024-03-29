package Com.Day3;
public class PrintEvenPosition {
    
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5,6};

        System.out.println("Array is:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Element present in even position");
        for(int i=0;i<arr.length;i+=2){
            System.out.print(arr[i]+" ");
        }
    }
}