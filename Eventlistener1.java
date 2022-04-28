interface EventListener{

	void performEvent();
}
interface MouseListener extends EventListener{

	void mouseClicked();

	void mousePressed();

	void mouseReleased();

	void mouseMoved();

	void mouseDragged();

}
interface KeyListener extends EventListener{

	void keyPressed();

	void keyReleased();

}
class eventDemo implements MouseListener,KeyListener{

	public void performEvent()
	{
		System.out.println("performEvent");
	}

	public void mouseClicked()
	{
		System.out.println("mouseClicked");
	}

	public void mousePressed()
	{
		System.out.println("mousePressed");
	}

	public void mouseReleased()
	{
		System.out.println("mouseReleased");
	}

	public void mouseMoved()
	{
		System.out.println("mouseMoved");
	}

	public void mouseDragged()
	{
		System.out.println("mouseDragged");
	}

	public void keyPressed() 
	{
		System.out.println("keyPressed");
	}

	public void keyReleased()
	{
		System.out.println("keyReleased");
	}
}
 public class Eventlistener1{
public static void main(String[] args){

	eventDemo e=new eventDemo();
	e.performEvent();
	e.mouseClicked();
	e.mousePressed();
	e.mouseReleased();
	e.mouseMoved();
	e.mouseDragged();
	e.keyPressed();
	e.keyReleased();

	}
} 