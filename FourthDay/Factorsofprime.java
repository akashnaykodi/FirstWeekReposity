package Com.FourthDay;

import java.util.Scanner;

public class Factorsofprime {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int N=sc.nextInt();
		
		for (int i = 2; i < N; i++) 
		{
			
				if(N%i==0)
				{
					System.out.print(i+" ");
					N/=i;
				}
		}
		
		if(N>2)
		{
			System.out.println(N);
		}
	}

}