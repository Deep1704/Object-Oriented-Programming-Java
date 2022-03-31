import java.util.Scanner;
class Voweldemo
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int Vowel=0;
		char ch;

		System.out.println("Enter a Sentence");
		String str=sc.nextLine();

while(!str.equals("quit"))
	{			

		System.out.println("Enter a Sentence");
	        str=sc.nextLine();

		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);

			if(ch=='a' || ch=='e' ||  ch=='i' || ch=='o' || ch=='u')
			{
				Vowel++;
			}
		}
	}	


		System.out.println("Vowels:"+Vowel);

	}
}
