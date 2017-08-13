class Multithread3 extends Thread
{
	
	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
		System.out.println("Start karo prabhu.");
		}
		else
		{
			System.out.println("Rok dijiye prabhu");
		}
	}
	
	public static void main(String args[])
	{
		
		Multithread3 mt3a=new Multithread3();
		Multithread3 mt3b=new Multithread3();
		
		mt3a.setDaemon(false);
		mt3b.setDaemon(true);
		
		mt3a.start();
		mt3b.start();
		
		
		System.out.println("\n"+mt3a.getName());
		/*
		System.out.println(mt2b.getName());
		System.out.println(mt2c.getName());  */
	}
	
}