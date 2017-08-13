class Multithread4 extends Thread
{
	
	public void run()
	{
		try
		{
			for(int i=0;i<=10;i++)
			{
				Thread.sleep(1000);
				System.out.println(this.getName()+" : "+i);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public static void main(String args[])
	{
		
		Multithread4 mt4a=new Multithread4();
		Multithread4 mt4b=new Multithread4();
		
		
		mt4a.setName("Ammoy");
		mt4b.setName("Kaustav");
		
		mt4a.start();
		mt4b.start();
		
		try
		{
			Thread.sleep(3000);
			mt4a.suspend();
			System.out.println("Suspending Thread Ammoy");
			Thread.sleep(3000);
			mt4a.resume();
			System.out.println("Resuming Ammoy thread");

			Thread.sleep(3000);
			mt4b.suspend();
			System.out.println("Suspending Thread Kaustav");
			Thread.sleep(3000);
			mt4b.resume();
			System.out.println("Resuming Thread Kaustav");
			
		    Thread.sleep(30000);
			mt4a.suspend();
			System.out.println("Suspending Thread Ammoy");
			Thread.sleep(3000);
			mt4a.resume();
			System.out.println("Resuming Ammoy thread");
			
			Thread.sleep(30000);
			mt4b.suspend();
			System.out.println("Suspending Thread Kaustav");
			Thread.sleep(3000);
			mt4b.resume();
			System.out.println("Resuming thread Kaustav");
			}
			catch(Exception e)
			{
				System.out.println(e);

			}
		
		
	}
	
}