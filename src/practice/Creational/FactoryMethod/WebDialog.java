package practice.Creational.FactoryMethod;

public class WebDialog implements Dialog{

    @Override
    public Button createButton() {
        return new HtmlButton();
    }

    public void render(){
        Button button = createButton();
        button.doStaff();
    }
}
