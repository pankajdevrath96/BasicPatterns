import java.util.Scanner;

public class second {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of x");
		int x=sc.nextInt();
		sc.close();
		for(int i=0;i<x;i++)
		{

			
			for(int j=0;j<x-i;j++)
				System.out.print("*");

			for(int j=0;j<2*i;j++)
				System.out.print(" ");

			for(int j=0;j<x-i;j++)
				System.out.print("*");
			
			System.out.print("\n"); 
	
		}
		for(int i=x-2;i>=0;i--)
		{

			
			for(int j=0;j<x-i;j++)
				System.out.print("*");

			for(int j=0;j<2*i;j++)
				System.out.print(" ");

			for(int j=0;j<x-i;j++)
				System.out.print("*");
			
			System.out.print("\n"); 
	
		}
	}

}
