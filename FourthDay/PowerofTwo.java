package Com.FourthDay;

import java.util.Scanner;

public class PowerofTwo {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the N : ");
		int N=sc.nextInt();
		
		if(N>=0 && N<=31)
		{
			for (int i = 0; i < N; i++) 
			{
				int result=(int)Math.pow(2, i);
				System.out.print(result+" ");
			}
		}
		else
		{
			System.out.println("Please enter value of N in Between 0 to 31");
		}

	}

}
