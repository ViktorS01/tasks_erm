package practice.Behavioral.Command;

public class CommandKostyaMes implements Command{
    Comp comp;

    public CommandKostyaMes(Comp comp) {
        this.comp = comp;
    }

    @Override
    public void execute() {
        comp.KostyaMessage();
    }
}
