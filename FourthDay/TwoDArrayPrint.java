package Com.FourthDay;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrayPrint {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No. of rows : ");
		int row=sc.nextInt();
		
		System.out.println("Enter No. of Columns : ");
		int column=sc.nextInt();
		
		int[][] arr=new int[row][column];
		
		System.out.println("Please enter the array values : ");
		
		for(int i=0;i<arr.length;i++)
		{
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println(" ");
			
		}

	}

}
