package practice.Crational.AbstractFactory;

public class MacFactory implements GUIFactory{
    @Override
    public CheckBox createCheckBox() {
        CheckBox checkBox = new MacCheckBox();
        return checkBox;
    }

    @Override
    public Button createButton() {
        Button button = new MacButton();
        return button;
    }
}
