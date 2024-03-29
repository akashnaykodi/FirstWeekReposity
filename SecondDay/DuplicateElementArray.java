package Com.Day3;
public class DuplicateElementArray {
    
    public static void main(String[] args) {
        
        int arr[] = {1,2,2,3,4,5,5};

        System.out.print("Array is :");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        
        System.out.println();
        System.out.print("Duplicate element in the array are:");
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    System.out.print(arr[j]+ " ");
                }
                
            }
        }
    }
}