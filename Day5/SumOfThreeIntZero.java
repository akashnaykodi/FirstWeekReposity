package Day5;
public class SumOfThreeIntZero {
    
    static void distinctTripleCount(int arr[],int n){
        int count =0;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i] + arr[j] + arr[k] ==0){
                        count ++;
                    }
                }
            }
        }
        System.out.println("Count of Distinct Triple is : " + count);
    }

    static void distinctTriplePrint(int arr[],int n){

        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i] + arr[j] + arr[k] ==0){
                        System.out.println("Distinct triples : "+ arr[i] +" "+arr[j]+" "+arr[k]);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        
        int arr[] = {3, -1, -7, -4, -5, 9, -4};
        int n = arr.length;

        System.out.print("Array is : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

        distinctTripleCount(arr, n);
        System.out.println();
        distinctTriplePrint(arr, n);
        


    }
}