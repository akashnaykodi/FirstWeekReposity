package Com.FourthDay;

import java.util.Scanner;

public class Maxthree {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number one : ");
		int num1=sc.nextInt();
		
		System.out.println("Enter the number Two : ");
		int num2=sc.nextInt();
		
		System.out.println("Enter the number Three : ");
		int num3=sc.nextInt();
		
		if((num1>num2) && (num1>num3))
		{
			System.out.println("Maximum Number among three is "+num1);
		}
		else if((num2>num1) && (num2>num3))
		{
			System.out.println("Maximum Number among three is "+num2);
		}
		else
			System.out.println("Maximum Number among three is "+num3);

	}

}