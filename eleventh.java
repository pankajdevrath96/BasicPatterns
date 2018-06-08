import java.util.Scanner;

public class eleventh {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of x");
		int x=sc.nextInt();
		sc.close();
		for(int i=0;i<2*x-1;i++)
		{
			if(i<x)
			{for(int j=0;j<2*x-1;j++)
				
				if(j+1>=x+i||j+1<=x-i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			else
			{
				for(int j=0;j<2*x-1;j++)
					if(j<=(i-x)+1|| j>=(2*x-(i-x))-3)
						System.out.print("*");
					else
						System.out.print(" ");
			}
			System.out.println();
		}

	}

}
