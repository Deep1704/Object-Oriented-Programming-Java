interface Transport{

	void deliever();
}
abstract class Animal{

	  abstract void display();
}
class Tiger extends Animal{

	void display()
	{
		System.out.println("Tiger class");
	}
}
class Camel extends Animal implements Transport
{
	void display()
	{
		System.out.println("Camel Class");
	}
	public void deliever()
	{
		System.out.println("Camel deliever");
	}
}
class Deer extends Animal{

	void display()
	{
		System.out.println("Deer class");
	}
}
class Donkey extends Animal implements Transport
{
	void display()
	{
		System.out.println("Donkey Class");
	}
	public void deliever()
	{
		System.out.println("Donkey deliever");
	}
}

class Animaldemo{
	public static void main(String[] args){

		Tiger t=new Tiger();
		t.display();

		Camel c=new Camel();
		c.display();
		c.deliever();

		Deer d=new Deer();
		d.display();

		Donkey a=new Donkey();
		a.display();
		a.deliever();


	}
}
