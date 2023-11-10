
public class Contatore extends Thread
{
	private String _nome;
	
	public Contatore(String nomeInput)
	{
		_nome = nomeInput;
	}
	
	public void run ()
	{
		setName(_nome);
		
		System.out.println(Thread.currentThread().getName());
		
		for(int i=0; i<10; i++)
		{
			System.out.println("Sono: " + _nome + " " + (i+1));
		}
	}
}
