package fla_2320.LA83.session12.chainofresponsibility;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Handler emailHandler = new EmailErrorHandler();
        Message message = new Message("error appear on your mailbox");
        emailHandler.handleMessage(message);
        emailHandler.handleMessage(new Message("full capacity"));

        Scanner in = new Scanner(System.in);
        in.nextLine();

        System.out.print("Name [min 5 chars] : ");
        String name = in.nextLine();
        Handler validator = new ValidationHandler();
        if (name.length() < 5) {
            validator.handleMessage(new Message("name must be at least 5 characters"));
        }

    }

}
