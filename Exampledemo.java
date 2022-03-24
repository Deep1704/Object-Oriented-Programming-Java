import java.util.Scanner;
class Example{
	int a;
	int b;
	int c;
	int d;

	Example(){
		a=1;
		b=2;
	}

	Example(int x,int y){
		a=x;
		b=y;
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
		Example obj2=new Example(5,2);

		obj1.displaydata();
		obj2.displaydata();
	}
}