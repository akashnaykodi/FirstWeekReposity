package Day5;
import java.util.Scanner;

public class CheckAlphabetIsVowel {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String a = sc.next().toLowerCase();

        char ch = a.charAt(0);
        if(ch!=1){
            System.out.println("Please enter only one character :");
        }

        if(ch== 'a' || ch=='i' || ch=='e' || ch=='o' || ch=='u'){
            System.out.println("The  entered alphabet is vowel.");
        }
        else{
            System.out.println( " The entered alphabet is not vowel.");
        }


        sc.close();
    }
}