package fla_2320.LA83.session10.mediatorpattern;

public class ChatServer implements Mediator {

    @Override
    public void sendMessage(Employee from, Employee to, String message) {
        System.out.println(
            String.format("'%s' send message '%s' to '%s'", from.getName(), message, to.getName())
        );
    }
}
