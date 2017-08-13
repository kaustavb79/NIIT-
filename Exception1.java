class Exception1
{
	
	public static void main(String args[])
	{
		try
		{
			int i,j,k;
			i=20;
			j=0;
			k=i/j;
			System.out.println("Answer: "+k);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Dum hai to rok k dikhao.");
		}
	}
	
}

/*  Exception Handling


Predefined Exceptions- 
1. IO Exception- Input-Output - In file handling
2. SQL Exception
3. Class not found Exception
4. Arithmatical Exception
5. Null Poiter Exception
6. Number format Exception
7. IndexOutof Bound Exception
8. ArrayIndexOutofBound Exception

Classes in Exception Handling-
try
catch
throw
throws
finally
*/