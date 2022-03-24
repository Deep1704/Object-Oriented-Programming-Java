import java.util.Scanner;

class Bank
{
	int accountno;
	String username;
	String email;
	String accountType;
	int accountbalance;

void setdata()
 {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter accountno");
	accountno=sc.nextInt();

	System.out.println("Enter username");
	username=sc.next();

	System.out.println("Enter email");
	email=sc.next();

	System.out.println("Enter accountType");
	accountType=sc.next();

	System.out.println("Enter accountbalance");
	accountbalance=sc.nextInt();

	System.out.println("    ");
 }

void displaydata()
 {
	System.out.println("accountno:"+accountno);
	System.out.println("username:"+username);
	System.out.println("email:"+email);
	System.out.println("accountType:"+accountType);
	System.out.println("accountbalance:"+accountbalance);
 }

}

public class Bank_Account{
	public static void main(String []args){

		Bank b1=new Bank();
		b1.setdata();
		b1.displaydata();

		System.out.println("=============");

		Bank b2=new Bank();
		b2.setdata();
		b2.displaydata();
	}
}