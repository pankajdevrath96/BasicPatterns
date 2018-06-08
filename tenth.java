import java.util.Scanner;

public class tenth {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of x");
		int x=sc.nextInt();
		sc.close();
		for(int i=0;i<x;i++)
		{
			
			for(int j=0;j<2*x-1;j++)
				if(i==x-1)
					System.out.print("*");
				else if(j+1==x+i||j+1==x-i)
					System.out.print("*");
				else
					System.out.print(" ");
			
			System.out.println();
		} 
	}

}
