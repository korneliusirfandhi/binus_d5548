package class_2410_lb83.week07_latihan01.after;

import java.util.Scanner;

public abstract class Member {
    public abstract void swmiming();
    public abstract void addDebt();

    public Scanner input = new Scanner(System.in);

    public int getMemberMenu(String name, int debt) {
        clear();
        System.out.println("Welcome, "+name);
        System.out.println("Your current debt : "+debt);
        System.out.println("Choose your activity : ");
        System.out.println("1. Swimming");
        System.out.println("2. Add debt");
        System.out.println("3. Back to previous menu");
        int choose = 0;
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

        return choose;
    }

    public void clear()
    {
        for(int i = 0; i<25; i++)System.out.println();
    }
}
