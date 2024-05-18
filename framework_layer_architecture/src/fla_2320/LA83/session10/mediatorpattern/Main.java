package fla_2320.LA83.session10.mediatorpattern;

public class Main {

    public static void main(String[] args) {
        ChatServer mediator = new ChatServer();
        Employee adam = new Employee();
        adam.setChatServer(mediator);
        adam.setName("Adam");

        Employee mada = new Employee();
        mada.setChatServer(mediator);
        mada.setName("Mada");

        adam.sendMessage(mada, "Hello Mad, Please check email!");
        mada.sendMessage(adam, "OK, I'll check it ASAP..");

    }
}
