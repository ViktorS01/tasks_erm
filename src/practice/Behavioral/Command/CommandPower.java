package practice.Behavioral.Command;

public class CommandPower implements Command{
    Comp comp;

    public CommandPower(Comp comp) {
        this.comp = comp;
    }

    @Override
    public void execute() {
        comp.power();
    }
}
