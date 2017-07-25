import java.util.Scanner;

class menuD
{
	// MENU	
	public static void menu()
	{
		System.out.println("-----MENU---- \n1.ITEM \n2.PRICE \n3.BILLING\n");
		System.out.println("Enter your choice: ");
	}
	
	
	//1.ITEM
	public static void Item()
	{
		System.out.println("\n 1.Burger \n 2.Pizza \n  ");
		System.out.println("Enter your choice: ");
		
	}
	
	//sub items ---BURGER
	public static void subItems1()
	{
		System.out.println("\n---VEG--- \n 1.Aaloo Tikki burger \n 2.Aaloo Tikki Subreme burger \n 3.Aaloo Tikki cheese burger \n 4. plain veg burger \n 5.Veg 'N' crisp burger \n 6.Veg king burger  \n 7.Maharaja Supreme burger \n");
		
		System.out.println("\n---NON VEG--- \n 1.Chicken burger \n 2.Chicken cheese burger \n 3.Chicken 'N' crisp burger \n 4.Maharaja Chicken burger \n 5.Egg burger \n 6. Mutton burger \n 7.Maharaja Mutton burger \n" );
	}
	
	//sub items ---PIZZA
	public static void subitems2()
	{
		System.out.println("\n---PAN PIZZA---");
		System.out.println("------VEG------");
		System.out.println(" \n 1.MARGHERITA \n 2.DOUBLE CHEESE \n 3.VEGGIE FEAST \n 4.VEGGIE LOVER \n 5.VEGGIE SUPREME \n 6.TANDOORI PANEER \n 7.PANEER VEGORAMA \n");
		
		System.out.println("------NON VEG------");
		System.out.println(" \n 1.CHICKEN SAUSAGE \n 2.KEMMA MASALA \n 3.CHICKEN TIKKA \n 4.CHICKEN PEPPERONI \n 5.CHICKEN SUPREME \n 6.ULTIMATE CHICKEN \n 7.TRIPLE CHICKEN FEAST \n");
	}
	
	
	
	
	public static void vegbur()
	{
		System.out.println("\n 1.Aaloo Tikki burger \n 2.Aaloo Tikki Subreme burger \n 3.Aaloo Tikki cheese burger \n 4. plain veg burger \n 5.Veg 'N' crisp burger \n 6.Veg king burger  \n 7.Maharaja Supreme burger \n");
	}
	
	public static void nonvegbur()
	{
		System.out.println("\n 1.Chicken burger \n 2.Chicken cheese burger \n 3.Chicken 'N' crisp burger \n 4.Maharaja Chicken burger \n 5.Egg burger \n 6. Mutton burger \n 7.Maharaja Mutton burger \n");
	}
	
	
	
	public static void vegpiz()
	{
		System.out.println(" \n 1.MARGHERITA \n 2.DOUBLE CHEESE \n 3.VEGGIE FEAST \n 4.VEGGIE LOVER \n 5.VEGGIE SUPREME \n 6.TANDOORI PANEER \n 7.PANEER VEGORAMA \n");	
	}
	
	public static void nonvegpiz()
	{
		System.out.println(" \n 1.CHICKEN SAUSAGE \n 2.KEMMA MASALA \n 3.CHICKEN TIKKA \n 4.CHICKEN PEPPERONI \n 5.CHICKEN SUPREME \n 6.ULTIMATE CHICKEN \n 7.TRIPLE CHICKEN FEAST \n");
	}
	
	
	
	
	
	
	
	
    //veg burger price
	public static void vegprice()
	{
		Scanner l=new Scanner(System.in);
						System.out.println("Enter your choice: ");
										int q=l.nextInt();
										
							switch(q)
								{
									case 1:
										System.out.println("ITEM NAME: .Aaloo Tikki burger \n\n PRICE: 35 INR ");
										break;
										
									case 2:
										System.out.println("ITEM NAME: Aaloo Tikki Subreme burger \n\n PRICE:69 INR ");
										break;
									case 3:
										System.out.println("ITEM NAME: Aaloo Tikki cheese burger \n\n PRICE:105 INR ");
										break;
									case 4:
										System.out.println("ITEM NAME: plain veg burger \n\n PRICE:28 INR ");
										break;
									case 5:
										System.out.println("ITEM NAME: Veg 'N' crisp burger \n\n PRICE:65 INR ");
										break;
									case 6:
										System.out.println("ITEM NAME: Veg king burger \n\n PRICE:75 INR ");
										break;
									case 7:
										System.out.println("ITEM NAME: Maharaja Supreme burger \n\n PRICE:108 INR ");
										break;
										
									default: 
										System.out.println("----Wrong input----");
								}
	}
	
	//nonveg burger price
	public static void nonvegprice()
	{
	
			Scanner l=new Scanner(System.in);
						System.out.println("Enter your choice: ");
										int w=l.nextInt();
										
							switch(w)
								{
									case 1:
										System.out.println("ITEM NAME: Chicken burger \n\n PRICE:50 INR ");
										break;
										
									case 2:
										System.out.println("ITEM NAME: Chicken cheese burger \n\n PRICE:68 INR ");
										break;
									case 3:
										System.out.println("ITEM NAME: Chicken 'N' crisp burger \n\n PRICE:100 INR ");
										break;
									case 4:
										System.out.println("ITEM NAME: Maharaja Chicken burger \n\n PRICE:135 INR ");
										break;
									case 5:
										System.out.println("ITEM NAME: Egg burger \n\n PRICE:40 INR ");
										break;
									case 6:
										System.out.println("ITEM NAME: Mutton burger \n\n PRICE:55 INR ");
										break;
									case 7:
										System.out.println("ITEM NAME: Maharaja Mutton burger \n\n PRICE:140 INR ");
										break;
										
									default: 
										System.out.println("----Wrong input----");
								}
								
								
	}
	
	
	
	
	//veg pizza price
	public static void vegprice1()
	{
		Scanner l=new Scanner(System.in);
						System.out.println("Enter your choice: ");
										int q=l.nextInt();
										
							switch(q)
								{
									case 1:
										System.out.println("ITEM NAME: MARGHERITA \n\n PRICE:125 INR ");
										break;
										
									case 2:
										System.out.println("ITEM NAME: DOUBLE CHEESE \n\n PRICE:150 INR ");
										break;
									case 3:
										System.out.println("ITEM NAME: VEGGIE FEAST \n\n PRICE:110 INR ");
										break;
									case 4:
										System.out.println("ITEM NAME: VEGGIE LOVER \n\n PRICE:108 INR ");
										break;
									case 5:
										System.out.println("ITEM NAME: VEGGIE SUPREME \n\n PRICE:108 INR ");
										break;
									case 6:
										System.out.println("ITEM NAME: TANDOORI PANEER \n\n PRICE:108 INR ");
										break;
									case 7:
										System.out.println("ITEM NAME: PANEER VEGORAMA \n\n PRICE:108 INR ");
										break;
										
									default: 
										System.out.println("----Wrong input----");
								}
	}
	
	//nonveg pizza price
	public static void nonvegprice1()
	{
		Scanner l=new Scanner(System.in);
						System.out.println("Enter your choice: ");
										int w=l.nextInt();
										
							switch(w)
								{
									case 1:
										System.out.println("ITEM NAME: CHICKEN SAUSAGE \n\n PRICE:210INR ");
										break;
										
									case 2:
										System.out.println("ITEM NAME: KEMMA MASALA \n\n PRICE:235 INR ");
										break;
									case 3:
										System.out.println("ITEM NAME: CHICKEN TIKKA \n\n PRICE:195 INR ");
										break;
									case 4:
										System.out.println("ITEM NAME: CHICKEN PEPPERONI \n\n PRICE:200 INR ");
										break;
									case 5:
										System.out.println("ITEM NAME: CHICKEN SUPREME \n\n PRICE:255 INR ");
										break;
									case 6:
										System.out.println("ITEM NAME: ULTIMATE CHICKEN \n\n PRICE:230 INR ");
										break;
									case 7:
										System.out.println("ITEM NAME: TRIPLE CHICKEN FEAST \n\n PRICE:290 INR ");
										break;
										
									default: 
										System.out.println("----Wrong input----");
								}
	}
	
	
	
	
	
	
	
	//PRICE SECTION
	public static void billing()
	{
		Scanner l=new Scanner(System.in);
		System.out.println("-----BILLING-----");
					System.out.println("Do you want to see the menu(y/Y) ");
					char a=l.next().charAt(0);
					
					if(a=='y'||a=='Y')
					 {
						Item();
						
							
							int i=l.nextInt();
								switch(i)
								{
									case 1:
										subItems1();
										System.out.println("Veg or nonveg (v/n): ");
										char r=l.next().charAt(0);
										
										if(r=='v')
										{
											vegbur();
											vegprice();
										
										}
										else if(r=='n')
										{
											nonvegbur();
											nonvegprice();
										}
										else 
										{
										System.out.println("--- Error ---");
										}
										
										break;
							

										
									case 2:
										subitems2();
										System.out.println("Veg or nonveg: ");
										char e=l.next().charAt(0);
										
										if(e=='v')
										{
											vegpiz();
											vegprice1();
										
										}
										else if(e=='n')
										{
											nonvegpiz();
											nonvegprice1();
										}
										else 
										{
										System.out.println("--- Error ---");
										}
										
										break;
							


								default:
									System.out.println("--- Error ---");
									
								
								}
								
							
								 
								 
					 }else
					 {
						int n=l.nextInt();
								switch(n)
								{
									case 1:
										subItems1();
										System.out.println("Veg or nonveg: ");
										char v=l.next().charAt(0);
										
										if(v=='v')
										{
											vegbur();
											vegprice();
										
										}
										else if(v=='n')
										{
											nonvegbur();
											nonvegprice();
										}
										else 
										{
										System.out.println("--- Error ---");
										}
										
										break;
							

										
									case 2:
										subitems2();
										System.out.println("Veg or nonveg: ");
										char z=l.next().charAt(0);
										
										if(z=='v')
										{
											vegpiz();
											vegprice1();
										
										}
										else if(z=='n')
										{
											nonvegpiz();
											nonvegprice1();
										}
										else 
										{
										System.out.println("--- Error ---");
										}
										
										break;
							


								default:
									System.out.println("--- Error ---");
									
								
								}
					 }
					 
					 
					 
	}
	
	
	public static void show()
	{
		Scanner p=new Scanner(System.in);
	
				Item();
					int u=p.nextInt();
					switch(u)
					{
						case 1:
							subItems1();
							break;
							
						case 2:
							subitems2();
							break;
						
						default:
						   System.out.println("---WRONG INPUT---");
					}
	
	}
	
	
	//VOID MAIN	
	public static void main(String args[])
	{
		Scanner p=new Scanner(System.in);
		//Scanner q=new Scanner(System.in);
		
		
		
			menu();
			int t=p.nextInt();

		switch(t)
		{
			case 1: 						//item
					show();
					break;
				
			case 2: 						//price
					billing();
					break;
					
		
					
			default:
				System.out.println("---WRONG INPUT---");
		}
		
			
		
	  
	}
	
}