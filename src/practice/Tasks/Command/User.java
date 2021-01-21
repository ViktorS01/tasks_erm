package practice.Tasks.Command;

public class User {
    CommandPrintHello commandPrintHello;
    CommandDateNow commandDateNow;

    public User(CommandDateNow commandDateNow, CommandPrintHello commandPrintHello){
        this.commandDateNow = commandDateNow;
        this.commandPrintHello = commandPrintHello;
    }

    public void toDo (String str1, String str2){
        if (str1 == "print" && str2 == "hello"){
            commandPrintHello.execute();
        }
        else if(str1 == "date" && str2 == "now"){
            commandDateNow.execute();
        }
        else {
            System.out.println("Error!");
        }
    }

}
