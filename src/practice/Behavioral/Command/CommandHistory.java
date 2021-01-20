package practice.Behavioral.Command;

import java.util.Stack;

public class CommandHistory {
    Stack<Command> stack = new Stack();

    public void push (Command command){
        stack.push(command);
    }

    public Command pop(){
        return stack.pop();
    }

    public boolean isEmpty (){
        return stack.isEmpty();
    }
}
