
class Multithread extends Thread
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

public static void main(String args[])
{
Multithread mt=new Multithread();
mt.start();
}

}

//kaustavb79@gmail.com
/*
Multithreading-
Thread: It is the part of a program. And running of multiple programs simultaneously is 
called Multithreading.
-Thread will be executed using Interface and Thread classes.
-public void run() is a predefined method of thread(As sir said, it starts and stop with
the help of run() method.)
*/