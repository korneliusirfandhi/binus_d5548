package class_2410_lb83.week07_latihan01.after;

import java.util.Scanner;

public class PremiumMember extends Member {
    private String name;
    private int debt;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getDebt() {
        return debt;
    }
    public void setDebt(int debt) {
        this.debt = debt;
    }

    @Override
    public void swmiming() {
        if(this.getDebt()<20000)
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
            this.setDebt(this.getDebt()-20000);
        }
    }

    @Override
    public void addDebt() {
        int temp2 = 0;
        do
        {
            System.out.print("Input your addition [0.."+(200000-this.getDebt())+"] : ");
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
        }while(temp2<0 || temp2>(200000-this.getDebt()));

        this.setDebt(this.getDebt()+temp2);
    }

}

