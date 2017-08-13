class Multithread2 extends Thread
{
	
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
	
	public static void main(String args[])
	{
		
		Multithread2 mt2a=new Multithread2();
		Multithread2 mt2b=new Multithread2();
		Multithread2 mt2c=new Multithread2();
		System.out.println(mt2a.getName());
		System.out.println(mt2b.getName());
		System.out.println(mt2c.getName());
		mt2a.setName("Ammoy");
		mt2b.setName("Kaustav");
		mt2c.setName("Shivani");
		
		mt2a.start();
		mt2b.start();
		mt2c.start();
		
		/*
		System.out.println(mt2a.getName());
		System.out.println(mt2b.getName());
		System.out.println(mt2c.getName());  */
	}
	
}