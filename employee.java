import java.util.Scanner;



class emp2 
{
	Scanner k=new Scanner(System.in);
	
	private int emp_id[]=new int[10];								//employee id
	private String name[][]=new String[50][10];						//employee name
	private float sal[]=new float[10];								//employee salary
	
	
	//System.out.println();
	
	public  void input(int q)
	{
		System.out.print("ENTER EMPLOYEE ID: ");
		emp_id[q]=k.nextInt();
	
		System.out.print("ENTER EMPLOYEE NAME: ");
		name[50][q]=k.next();
		
		System.out.print("ENTER EMPLOYEE SALARY: ");
		sal[q]=k.nextFloat();
	}
	
	//System.out.println();
	
	public void output(int q)
	{
		System.out.print(" EMPLOYEE ID: " + emp_id[q]);
		System.out.print(" EMPLOYEE NAME: " + name[50][q]);
		System.out.print(" EMPLOYEE SALARY: " + sal[q]);
	}
	
}


class employee
{
	public static void main(String ar[])
	{
		Scanner h=new Scanner(System.in);
		emp2 l=new emp2();
		
		System.out.print("Enter how many records you want to enter: ");
		int s=h.nextInt();
		
		for(int i=0;i<s;i++)
		{
			l.input();
		}
		
		System.out.println();
		
		for(int i=0;i<s;i++)
		{
			l.output();
			System.out.println();
		}
	}

}