import java.util.Scanner;

public class third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of x");
		int x=sc.nextInt();
		sc.close();
		for(int i=0;i<2*x-1;i++)
			{ 
				for(int j=0;j<x;j++)
				{
					if(i==0||i==x-1||i==2*x-2)
					{  
						if(j==0||j==x-1)
							System.out.print(" ");
						else
							System.out.print("*");
					}
					else
					{
						if(j==0||j==x-1)
						System.out.print("*");
						else
						System.out.print(" ");
					}
				}
			 System.out.print("\n");
		}
	}
}	
 
