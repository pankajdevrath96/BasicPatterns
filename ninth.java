import java.util.Scanner;

public class ninth {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of x");
		int x=sc.nextInt();
		sc.close();
		for(int i=0;i<2*x-1;i++)
		{
			for(int j=0;j<2*x-1;j++)
				if(i==j|| i+j==2*x-2)
					System.out.print("*");
				else
					System.out.print(" ");
			System.out.println();
		}

	}

}
