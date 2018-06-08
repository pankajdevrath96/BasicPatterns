import java.util.Scanner;

public class first {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of x");
		int x=sc.nextInt();
		sc.close(); 
		for(int j=0;j<x;j++)
			{
				for(int k=0;k<2*j;k++)
					System.out.print(" ");
				for(int k=x;k-j>0;k--)
					System.out.print("*");

				System.out.print("\n");
			}
			for(int j=x-1;j>0;j--)
			{
				for(int k=0;k<2*j-2;k++)
					System.out.print(" ");
				for(int k=x;k-j>=0;k--)
					System.out.print("*");
				System.out.print("\n");
			}
		 
		
	}

}
