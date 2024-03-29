package Com.FourthDay;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter value of a : ");
		double a=sc.nextDouble();
		
		System.out.println("Please enter value of b : ");
		double b=sc.nextDouble();
		
		System.out.println("Please enter value of c : ");
		double c=sc.nextDouble();
		
		double delta=b*b-4*a*c;
//		System.out.println(delta);
		
		if(delta>0)
		{
			double root1=(-b + Math.sqrt(delta))/2*a;
			double root2=(-b - Math.sqrt(delta))/2*a;
			System.out.println("value of root1 is : "+root1+" root2 is : "+root2);
		}
		else if(delta==0)
		{
			double root=-b/2*a;
			System.out.println("Value of root is : "+root);
		}
		else {
			double root3=-b/2*a;
			double root4=(-b + Math.sqrt(-delta))/2*a;
			System.out.println("Value of Root are "+root3+" and Another root is "+root4);
		}
		

	}

}
