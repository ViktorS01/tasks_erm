package practice.Creational.FactoryMethod;

public class WindowsDialog implements Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    public void render(){
        Button button = createButton();
        button.doStaff();
    }
}
