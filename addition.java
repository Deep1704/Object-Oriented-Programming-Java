import java.util.Scanner;
public class addition{

	int sum(int x,int y)
	{
		int c=x+y;
		return c;
	}

	public static void main(String[] args){

		Scanner input=new Scanner(System.in);

		System.out.println("Enter a: ");
		int a=input.nextInt();

		System.out.println("Enter b: ");
		int b=input.nextInt();

		addition obj1=new addition();
		int Ans=obj1.sum(a,b);

		System.out.println("Answer: "+Ans);
	}
}