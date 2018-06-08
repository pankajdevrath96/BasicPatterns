import java.util.Scanner;

public class divisilble_by_3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter the value of x");
		int x=sc.nextInt();
		sc.close(); 
		if(x>0)
		if(x%3==0&&x%5==0) 
			System.out.print("Acadview Learning");
		else if(x%3==0)
			System.out.print("Acadview");
		else if(x%5==0)
			System.out.print("Learning");
		else
			System.out.print("Please enter a valid number");
		else
			System.out.print("Please enter a valid number");
			
		
	}

}
