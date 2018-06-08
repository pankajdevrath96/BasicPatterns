import java.util.Scanner;

public class Sixth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of x");
		int x=sc.nextInt();
		sc.close(); 
		for(int i=0;i<2*x-1;i++)
		{
			if(i<x)
			for(int j=x;j>=x-i;j--)
				System.out.print("*");
			else
				for(int j=2*x-1;j>i;j--)
					System.out.print("*");
			System.out.print("\n");
		}

	}

}
