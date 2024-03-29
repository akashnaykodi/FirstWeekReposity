package Com.FourthDay;

import java.util.Scanner;

public class QuotiennRemainder {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter Dividend : ");
		int dividend=sc.nextInt();
		System.out.println("Please Enter Divisor : ");
		int divisor=sc.nextInt();
		
		int remainder=dividend%divisor;
		int quotient=dividend/divisor;
		
		System.out.println("Remainder is : "+remainder+" and quotient is : "+quotient);

	}

}
