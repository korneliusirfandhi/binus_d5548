package fla_2320.LA83.session10.mediatorpattern;

public class Employee {

    private String name;
    private ChatServer chatServer;

    public ChatServer getChatServer() {
        return chatServer;
    }

    public void setChatServer(ChatServer chatServer) {
        this.chatServer = chatServer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMessage(Employee to, String message) {
        chatServer.sendMessage(this, to, message);
    }
}
