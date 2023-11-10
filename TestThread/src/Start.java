
public class Start {

	public static void main(String[] args) 
	{
		Contatore c = new Contatore("Contatore1");
		c.start();		
		
		System.out.println(Thread.currentThread().getName());		
		System.out.println("Ciao");	
	}
}
