package Com.FourthDay;

import java.util.Scanner;

public class Triplet {

	public static void main(String[] args) 
	{
		int[] a=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array elements : ");
		
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		
		int size=0;
		for (int i = 0; i < a.length; i++) 
		{
			int count=0;
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]==a[j])
				{
					count++;
				}
				
			}
			if(count==0)
			{
				size++;
			}
		}
		
		int[] b=new int[size];
		int index=0;
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]==a[j])
				{
					count++;
				}
				
			}
			if(count==0)
			{
				b[index++]=a[i];
			}
		}
		
		for(int i=0;i<b.length;i++)
		{
			for (int j = i+1; j < b.length; j++) 
			{
				for (int k = j+1; k < b.length; k++) 
				{
					System.out.println(a[i]+" "+a[j]+" "+a[k]);
					
				}
				
			}
		}
	}
	

}