package practice.Behavioral.Mediator;

public class Admin implements Client{
    Chat chat;

    public Admin(Chat chat) {
        this.chat = chat;
    }

    public void sendMessage(String message) {
        chat.sendMessage(message);
    }

    public void getMessage(String message) {
        System.out.println("Админ получает сообщение: " + message);
    }
}
