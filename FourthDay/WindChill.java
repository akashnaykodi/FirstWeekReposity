package Com.FourthDay;

import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of Temperature : ");
		double Temperature=sc.nextDouble();
		
		System.out.println("Enter the value of Wind Speed : ");
		double Speed=sc.nextDouble();
		
		double WindChill=0;
		
//		double windTemp=((0.4275*Temperature));
		
//		WindChill=35.74+(0.6215*Temperature)+((0.4275*Temperature)- 35.75)* (Math.pow(Speed, 0.16));
		
		if((Temperature<=50) && (Speed<=120 && Speed>=3))
		{
			WindChill=35.74+(0.6215*Temperature)+((0.4275*Temperature)- 35.75)* (Math.pow(Speed, 0.16));
			System.out.println(WindChill);
		}
		else {
			System.out.println("Enter the valid values of Tempratute and speed");
		}
		
		System.out.println();
		
		
		

	}

}