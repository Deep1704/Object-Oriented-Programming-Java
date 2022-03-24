import java.util.Scanner;
 class Student
{
	int rollno;
	String name;
	int age;

  void setdata()
    {
     Scanner sc=new Scanner(System.in);	
 	 System.out.println("Enter rollno:");
 	 rollno=sc.nextInt();

 	  System.out.println("Enter name:");
 	  name=sc.next();

 	   System.out.println("Enter age:");
 	   age=sc.nextInt();
    }

   void displaydata()
  {
 	System.out.println("rollno:"+rollno);
 	System.out.println("Name:"+name);
 	System.out.println("age:"+age);
  }
 }
 
 public class Studentdemo
 {
 	public static void main(String []args)
 	{
 		Student s1=new Student();
 		s1.setdata();
 		s1.displaydata();

 		System.out.println("   ");

 		Student s2=new Student();
 		s2.setdata();
 		s2.displaydata();
 	}
 } 