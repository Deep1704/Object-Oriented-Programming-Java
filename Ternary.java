import java.util.Scanner;
class Ternary
{
	 public static void main(String[] args) {

	 	Scanner sc=new Scanner(System.in);

	 	System.out.print("Enter no.1:");
	 	int a=sc.nextInt();

	 	System.out.print("Enter no.2:");
	 	int b=sc.nextInt();

	 	System.out.print("Enter no.3:");
	 	int c=sc.nextInt();

	 	int d=(a>b) ? ((a>c)?(a):(c)) : ((b>c)?(b):(c));
		
		System.out.println(d+ " is largest number");		
	}
}