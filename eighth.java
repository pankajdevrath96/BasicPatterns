import java.util.Scanner;

public class eighth {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of x");
		int x=sc.nextInt();
		sc.close(); 
		for(int i=0;i<x;i++)
		{
			for(int j=0;j<x+i;j++)
			{
				if(i==0 || (i==x-1 &&j>=x)) System.out.print("*");
				
				else if(j==i||j==x+i-1)

					System.out.print("*");
				else 
					System.out.print(" ");
			}
			System.out.println();
		}
		/*for(int i=0;i<x;i++)
		{
			if(i==0)
				for(int j=0;j<x;j++)
					System.out.print("*");
			else if(i==x-1)
				{
				for(int j=0;j<x-1;j++)
					System.out.print(" ");
				for(int j=0;j<x;j++)
					System.out.print("*");}
			else
			{
				for(int j=0;j<x+i;j++)
					if(j==i||j==x+i-1)

						System.out.print("*");
					else 

						System.out.print(" ");
			}

			System.out.println();
		}*/
	}

}

