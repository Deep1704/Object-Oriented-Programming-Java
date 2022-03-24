import java.util.Scanner;
public class greater{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);

		System.out.println("Enter a:");
		int a=input.nextInt();

		System.out.println("Enter b:");
		int b=input.nextInt();

		System.out.println("Enter c:");
		int c=input.nextInt();


		System.out.println("");

		if(a>b && a>c)
		{
			System.out.println("A is greater than b and c");
		}
		else if(b>a && b>c)
		{
			System.out.println("B is greater than a and c");
		}
		else
		{
			System.out.println("c is greater than a and b");
		}	

	}
} 