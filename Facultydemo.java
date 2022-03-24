import java.util.Scanner;
class Faculty
{
	String name;
	String branch;
	int salary;
		
void setdata()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter name");
	name=sc.next();

	System.out.println("    ");

	System.out.println("Enter salary");
	salary=sc.nextInt();

	System.out.println("    ");

	System.out.println("Enter branch");
	branch=sc.next();

	System.out.println("    ");

}

void displaydata()
 {
	System.out.println("Name:"+name);
	System.out.println("Branch:"+branch);
	System.out.println("Salary:"+salary);
 }
}

public class Facultydemo{
	 public static void main(String []args)
	 {

	 	Faculty s1=new Faculty();
	 	s1.setdata();
	 	s1.displaydata();

	 	System.out.println("=============");

	 	Faculty s2=new Faculty();
	 	s2.setdata();
	 	s2.displaydata();
	 }
}