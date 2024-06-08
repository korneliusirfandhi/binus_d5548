package fla_2320.LA83.session12.chainofresponsibility;

public class ValidationHandler implements Handler {
    @Override
    public void handleMessage(Message message) {
        System.err.println(message.getMessage());
    }
}
