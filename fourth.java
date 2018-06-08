import java.util.Scanner;

public class fourth {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of x");
		int x=sc.nextInt();
		sc.close(); 
		System.out.println("!st pattern");
		for(int i=0;i<2*x-1;i++)
		{

			if(i<x) {
			for(int j=0;j<x-i-1;j++)
				System.out.print(" ");

			for(int j=0;j<2*i+1;j++)
				System.out.print("*");

			for(int j=0;j<x-i;j++)
				System.out.print(" ");
			}
			else 
				for(int j=0;j<2*x-1;j++)
					System.out.print("*");
			System.out.print("\n"); 
	
		}
		

		System.out.println("2nd pattern");
		for(int i=0;i<x;i++)
		{

			
			for(int j=0;j<x-i-1;j++)
				System.out.print(" ");

			for(int j=0;j<2*i+1;j++)
				System.out.print("*");

			for(int j=0;j<x-i;j++)
				System.out.print(" ");
			
			System.out.print("\n"); 
	
		}
		for(int i=x-2;i>=0;i--)
		{

			
			for(int j=0;j<x-i-1;j++)
				System.out.print(" ");

			for(int j=0;j<=2*i;j++)
				System.out.print("*");

			 
			
			System.out.print("\n"); 
	
		}
		

	}

}
