class Multithread1 extends Thread
{

public void run()
{

for(int i=0;i<=10;i++)
{
	try
	{
		Thread.sleep(1000);
		System.out.println(i);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}

}

public void show()
{

for(int i=0;i<=10;i++)
{
	try
	{
		Thread.sleep(2000);
		System.out.println(i);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
	
}

public static void main(String args[])
{
	Multithread1 mt1=new Multithread1();
	
	mt1.start();
	mt1.show();
	
}

}