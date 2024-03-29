package Com.FourthDay;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		System.out.println("Enter the Year : ");
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		
		int count=0;
		while(year>0)
		{
			year/=10;
			count++;
		}
//		System.out.println(count);
		
		if(count==4)
		{
			if(year%100==0)
			{
				if(year%400==0)
				{
					System.out.println("Year is leap year");
				}
				else {
					System.out.println("Year is not leap year");
				}
				
			}
			else {
				if(year%4==0)
				{
					System.out.println("Year is leap year");
				}
				else {
					System.out.println("Year is not leap year");
				}
			}
		}
		else {
			System.out.println("Please Enter Valid Year or Year Must have 4 Digits");
		}

	}

}