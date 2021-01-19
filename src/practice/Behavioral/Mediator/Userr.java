package practice.Behavioral.Mediator;

public class Userr implements Client{
    Chat chat;

    public Userr(Chat chat) {
        this.chat = chat;
    }

    public void sendMessage(String message) {
        chat.sendMessage(message);
    }

    public void getMessage(String message) {
        System.out.println("Пользователь получает сообщение: " + message);
    }
}
