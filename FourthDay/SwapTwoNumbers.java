package Com.FourthDay;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		
		int a=40;
		int b=100;
		
		System.out.println("Before Swapping Value of A is "+a+" and Value of B is "+b);
		
		int temp=a; //10
		a=b; //20
		b=temp; //10
		
		System.out.println("After Swapping Value of A is "+a+" and Value of B is "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After Swapping Value of A is "+a+" and Value of B is "+b);
				
		
		
		

	}

}