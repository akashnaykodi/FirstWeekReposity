package Com.Day3;
public class FrequencyArray {

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 2, 4, 6, 7 };
        int n = arr.length;

        System.out.println("Array is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        boolean freq[] = new boolean[n];

        System.out.println("Elements : Frequency ");
        for (int i = 0; i < n; i++) {
            int count = 1;

            if(freq[i]){
                continue;
            }

            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    freq[j] = true;
                    count++;

                }
            }
            
            System.out.println(arr[i]+" : "+count);
        }  

    }
}