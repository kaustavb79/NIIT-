class Exception2a
{

public void sum(int x,int y)
{
if(x==0)
{
throw new ArithmeticException("You can't find sum.");
}
else
{
int z=x+y;
System.out.println(z);
}

}

}

class Exception2
{

public static void main(String args[])
{
Exception2a e2o=new Exception2a();
try
{
e2o.sum(0,4);
}
catch(Exception e)
{
System.out.println(e);
}

}

}


//Throws are useful to throw the error/exception from one class to another class.