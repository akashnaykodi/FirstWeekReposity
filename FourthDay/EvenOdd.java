package Com.FourthDay;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		System.out.println("Enter the Number : ");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		
		if(number%2==0)
		{
			System.out.println("Given Number is Even Number");
		}
		else {
			System.out.println("Given Number is Odd Number");
		}

	}

}