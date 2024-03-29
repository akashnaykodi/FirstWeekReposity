package Com.FourthDay;

import java.util.Scanner;

public class NthHarmonicnumber {

	public static void main(String[] args) {
		System.out.println("Enter the value of N : ");
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		
		double sum=0.0;
		for(int i=1;i<=N;i++) 
		{
			sum+=1.0/i;
		}
		System.out.println("N th Harmonic Number is "+sum);

	}

}
