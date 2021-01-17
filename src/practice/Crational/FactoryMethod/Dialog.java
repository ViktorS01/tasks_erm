package practice.Crational.FactoryMethod;

public abstract class Dialog {

    public void render(){
        Button button = createButton();
        button.doStaff();
    }
    public abstract Button createButton ();
}
