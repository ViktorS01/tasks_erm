package practice.Behavioral.ChainOfResponsibility;

public class EmailLogger implements Logger{
    public int priority;

    public EmailLogger (int priority){
        this.priority = priority;
    }

    public void writeMessage(String message, int level) {
        if (level <= priority){
            System.out.println("Смс на почту : " + message);
        }
    }
}
