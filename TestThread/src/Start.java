
public class Start {

	public static void main(String[] args) 
	{
		Contatore c = new Contatore("Contatore1");
		c.start();		

		Contatore c2 = new Contatore("Contatore2");
		c2.start();	
		
		Contatore c3 = new Contatore("Contatore3");
		c3.start();	
		
		System.out.println(Thread.currentThread().getName());		
		System.out.println("Ciao");	
	}
}
