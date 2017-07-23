import java.util.Scanner;

class pattern_2
{
	public static void main(String args[])
	{
		int i,j,k,h,m;
		Scanner p=new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		m=p.nextInt();
		
		for(i=1;i<=m;i++)
		{
			for(j=5;j>=i;j--)
			{System.out.print(" ");}
			
			for(k=1;k<=i;k++)
			{System.out.print(""+k);}
			
			for(h=i-1;h>=1;h--)
			{System.out.print(""+h);}
			
			System.out.println();
		}
		
	}
}