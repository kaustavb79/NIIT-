import java.util.Scanner;

class 0neD1
{
	public static void main(String args[])
	{
		Scanner k=new Scanner(System.in);
		int i,max;
		int t[]=new int[5];
		for(i=0;i<5;i++)
		{
			System.out.print("Enter a number: ");
			t[i]=k.nextInt();
		}
		  max=t[0];
		for(i=0;i<5;i++)
		{
		  System.out.println(t[i]);
		}
		
		for(i=0;i<5;i++)
		{
			if(t[i]>max)
		  System.out.println(t[i]);
		}
		
		
	}
}