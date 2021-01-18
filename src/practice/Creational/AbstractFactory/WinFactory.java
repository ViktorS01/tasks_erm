package practice.Creational.AbstractFactory;

public  class WinFactory implements GUIFactory {
    @Override
    public CheckBox createCheckBox() {
        CheckBox checkBox = new WinCheckBox();
        return checkBox;
    }

    @Override
    public Button createButton() {
        Button button = new WinButton();
        return button;
    }
}
