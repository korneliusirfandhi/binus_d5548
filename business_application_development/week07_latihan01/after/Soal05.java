
package class_2410_lb83.week07_latihan01.after;

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
						int choose = pm.getMemberMenu(pm.getName(), pm.getDebt());
						switch(choose)
						{
							case 1 :
							{
								pm.swmiming();
								break;
							}
							case 2 :
							{
								clear();
								pm.addDebt();
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
						int choose = gm.getMemberMenu(gm.getName(), gm.getDebt());
						gm.setDiscount(gm.getDebt()/1000);

						switch(choose)
						{
							case 1 : {
								gm.swmiming();
								break;
							}
							case 2 :
							{
								clear();
								gm.addDebt();
								break;
							}
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
