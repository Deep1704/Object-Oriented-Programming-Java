import java.util.Scanner;
public class Area{

    float circlearea(int a){

		float c=3.14f*a*a;
		return c;
	}

	public static void main(String[] args){

		Scanner input=new Scanner(System.in);
		System.out.println("Enter radius: ");
		int r=input.nextInt();

		Area DK=new Area();
		float Ans=DK.circlearea(r);

		System.out.println("Area of circle: "+Ans);

	}
}