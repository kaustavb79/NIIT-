import java.util.Scanner;

class twoD_trans
{
	public static void main(String args[])
	{
		int i,j,m,n;
		Scanner l=new Scanner(System.in);
		
		System.out.print("Enter row size: ");
		m=l.nextInt();
		
		System.out.println("Enter column size: ");
		n=l.nextInt();
		
		int a[][]=new int[m][n];
		
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print("Enter an number: ");
				a[i][j]=l.nextInt();
			}
		}
		System.out.println();
		
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(" "+a[i][j]);
				
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("TRANSPOSE: ");
		for(j=0;j<n;j++)
		{
			for(i=0;i<m;i++)
			{
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}
	}
	
}