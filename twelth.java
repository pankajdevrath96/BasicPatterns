import java.util.Scanner;
public class twelth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of x");
		int x=sc.nextInt();
		sc.close();
		for(int i=0;i<2*x;i++)
		{
			for(int j=0;j<=2*x-1;j++)
			{
				if(i==0 || i==2*x-1)
					System.out.print("*");
				else if(j==x-1||j==2*x-1)
					System.out.print("*");
					else
						System.out.print(" ");
			}
			System.out.println();
		}

	}

}
