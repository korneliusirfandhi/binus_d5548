package class_2410_lb83.week07_latihan01.before;

import java.util.Scanner;


public class Soal05
{
	private Scanner input = new Scanner(System.in);
	private String temp;
	private int type, choose, temp2;
	private PremiumMember pm = new PremiumMember();
	private GoldMember gm = new GoldMember();

	public Soal05()
	{
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("\t\t\t\tWelcome to BluePool");
		input.nextLine();

		do
		{
			clear();
			do
			{
				System.out.print("Please input your name [3..20] : ");
				temp = input.nextLine();
			}while(temp.length()<3 || temp.length()>20);
			clear();
			System.out.println("Welcome, "+temp);
			System.out.println("Please input your member type : ");
			System.out.println("================================");
			System.out.println("1. Premium");
			System.out.println("2. Gold");
			System.out.println("3. Exit");
			do
			{
				System.out.print("Choose your type : ");
				try
				{
					type = input.nextInt();
					input.nextLine();
				}
				catch(Exception e)
				{
					type = 0;
					System.out.println("Must be a number !");
					input.nextLine();
				}
			}while(type<1||type>3);

			if(type == 3)break;

			switch(type)
			{
				case 1 :
				{
					pm.setName(temp);
					pm.setDebt(100000);
					do
					{
						clear();
						System.out.println("Welcome, "+pm.getName());
						System.out.println("Your current debt : "+pm.getDebt());
						System.out.println("Choose your activity : ");
						System.out.println("1. Swimming");
						System.out.println("2. Add debt");
						System.out.println("3. Back to previous menu");
						do
						{
							System.out.print("Choose : ");
							try
							{
								choose = input.nextInt();
								input.nextLine();
							}
							catch(Exception e)
							{
								choose = 0;
								System.out.println("Must be a number !");
								input.nextLine();
							}
						}while(choose<1 || choose>3);

						switch(choose)
						{
							case 1 :
							{
								if(pm.getDebt()<20000)
								{
									System.out.println("Not Enought Debt !");
									input.nextLine();
								}
								else
								{
									clear();
									System.out.println("Swimming....");
									System.out.println("Please wait..");
									for(int i = 0; i<999999999; i++);
									for(int i = 0; i<999999999; i++);
									for(int i = 0; i<999999999; i++);
									System.out.println("Please ENTER to continue...");
									input.nextLine();
									pm.setDebt(pm.getDebt()-20000);
								}
							}
							break;
							case 2 :
							{
								clear();
								do
								{
									System.out.print("Input your addition [0.."+(200000-pm.getDebt())+"] : ");
									try
									{
										temp2 = input.nextInt();
										input.nextLine();
									}
									catch(Exception e)
									{
										temp2 = -1;
										System.out.println("Must be a number !");
										input.nextLine();
									}
								}while(temp2<0 || temp2>(200000-pm.getDebt()));

								pm.setDebt(pm.getDebt()+temp2);
							}
							break;
						}

					}while(choose !=3);
				}
				break;
				case 2 :
				{
					gm.setName(temp);
					gm.setDebt(200000);

					do
					{
						clear();
						System.out.println("Welcome, "+gm.getName());
						System.out.println("Your current debt : "+gm.getDebt());
						System.out.println("Choose your activity : ");
						System.out.println("1. Swimming");
						System.out.println("2. Add debt");
						System.out.println("3. Back to previous menu");
						do
						{
							System.out.print("Choose : ");
							try
							{
								choose = input.nextInt();
								input.nextLine();
							}
							catch(Exception e)
							{
								choose = 0;
								System.out.println("Must be a number !");
								input.nextLine();
							}
						}while(choose<1 || choose>3);

						gm.setDiscount(gm.getDebt()/1000);

						switch(choose)
						{
							case 1 :
							{
								if(gm.getDebt()<20000)
								{
									System.out.println("Not Enought Debt !");
									input.nextLine();
								}
								else
								{
									clear();
									System.out.println("Swimming....");
									System.out.println("Please wait..");
									for(int i = 0; i<999999999; i++);
									for(int i = 0; i<999999999; i++);
									for(int i = 0; i<999999999; i++);
									System.out.println("Please ENTER to continue...");
									input.nextLine();
									gm.setDebt(gm.getDebt()-(20000-gm.getDiscount()));
								}
							}
							break;
							case 2 :
							{
								clear();
								do
								{
									System.out.print("Input your addition [0.."+(400000-gm.getDebt())+"] : ");
									try
									{
										temp2 = input.nextInt();
										input.nextLine();
									}
									catch(Exception e)
									{
										temp2 = -1;
										System.out.println("Must be a number !");
										input.nextLine();
									}
								}while(temp2<0 || temp2>(400000-gm.getDebt()));

								gm.setDebt(gm.getDebt()+temp2);
							}
							break;
						}

					}while(choose !=3);
				}
				break;
			}
		}while(type!=3);

		clear();
		System.out.println("\t\t\tThanks for using this application..");
		System.out.println("\t\t\t==================================");
		System.out.println("\t\t\tDo Extra Effort and Keep Moving On");
		System.out.println("\t\t\t==================================\n\n\n\n\n\n\n");

	}

	public static void main(String[] args)
	{
		new Soal05();
	}

	public void clear()
	{
		for(int i = 0; i<25; i++)System.out.println();
	}
}
