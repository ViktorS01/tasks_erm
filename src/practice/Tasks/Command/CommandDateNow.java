package practice.Tasks.Command;

import java.util.Date;

public class CommandDateNow implements Command{
    public void execute(){
        System.out.println("Date now: " + new Date());
    }
}
