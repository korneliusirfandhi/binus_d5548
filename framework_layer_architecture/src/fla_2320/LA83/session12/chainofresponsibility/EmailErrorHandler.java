package fla_2320.LA83.session12.chainofresponsibility;

public class EmailErrorHandler implements Handler {
    @Override
    public void handleMessage(Message message) {
        try {
            if (message.getMessage().contains("error")) {
                System.out.println("Email is error");
            } else {
                throw new RuntimeException("Another error!");
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
