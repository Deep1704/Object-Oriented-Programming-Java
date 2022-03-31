class Time{

	int hh;
	int mm;

		Time()
		{
			hh=0;
			mm=0;
		}

		Time(int x,int y)
		{
			hh=x;
			mm=y;
		}

		void displaydata()
		{
			System.out.println("Hours:"+hh);
			System.out.println("Minutes:"+mm);
		}

		Time add(Time b)
		{
			Time temp=new Time();

			temp.mm=this.mm+b.mm;
			temp.hh=this.hh+b.hh+(temp.mm/60);
			temp.mm=temp.mm%60;


			return temp;
		}
}
class Timedemo
{
	public static void main(String[] args)
	{
		Time t1=new Time(5,35);
	
		Time t2=new Time(6,45);
		
		Time t3=new Time();

		t3=t1.add(t2);

		t1.displaydata();
		t2.displaydata();
		t3.displaydata();
	}
}		
