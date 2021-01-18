package practice.Behavioral.Command;

public class CommandOnWOT implements Command{
    Comp comp;

    public CommandOnWOT(Comp comp) {
        this.comp = comp;
    }

    @Override
    public void execute() {
        comp.onWOT();
    }
}
