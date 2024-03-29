package Com.FourthDay;

import java.util.Scanner;

public class EuclideanDistance {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of x : ");
		int x=sc.nextInt();
		
		System.out.println("Enter the value of y : ");
		int y=sc.nextInt();
		
		int valueX=x*x;
		int valueY=y*y;
		
		int combineResult=valueX+valueY;
//		System.out.println(valueX+" "+valueY+" "+combineResult);
		
		double Distance = Math.sqrt(combineResult);
		System.out.println("Euclidean Distance from point"+"("+x+","+y+")"+" to the origin (0,0) is "+Distance);
	}

}
