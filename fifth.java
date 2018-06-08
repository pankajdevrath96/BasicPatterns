import java.util.Scanner;

public class fifth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of x");
		int x=sc.nextInt();
		sc.close(); 
		for(int i=0;i<x;i++)
		{
			for(int j=0;j<x-i;j++)
			
				if(j==0||j==x-i-1 || i==0)
					System.out.print("*");
				else
					System.out.print(" ");
			System.out.print("\n");
		}

	}

}
