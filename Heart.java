import java.util.Scanner;
public class Heart {
    public static void print(int x)
    {
    	for (int i=x/2-2;i<=x;i+=2) 
    	{
    		   for (int j=1;j<x-i;j+=2)
    		       System.out.print(" ");
    		   for (int j=1;j<=i;j++)
    		       System.out.print("*");
    		   for (int j=1;j<=x-i;j++)
    		       System.out.print(" ");
    		   for (int j=1;j<=i-1;j++)
    		       System.out.print("*"); 
    		   System.out.println();
    	}
    	for (int i=x;i>=0;i--) 
    	{
    		   for (int j=i;j<x;j++)
    		       System.out.print(" ");
    		   for (int j=1;j<=((i*2)-1);j++)
    		       System.out.print("*");
    		   System.out.println();
    	}
    }
public static void main(String arg[]) {
   Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of x");
	int x=sc.nextInt();
	sc.close(); 
	 print(x);
	}

}
