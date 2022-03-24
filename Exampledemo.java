import java.util.Scanner;
class Example{
	int a;
	int b;

	Example(){
		a=1;
		b=2;
	}

	void displaydata(){
		System.out.println("A:"+a);
		System.out.println("B:"+b);
	}	
}

public class Exampledemo{
	public static void main(String []args)
	{
		Example obj1=new Example();
		obj1.displaydata();
	}
}