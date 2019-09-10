package behavioral.mediator.GraphicEditor;

public class App {
    public static void main(String[] args) {
        UIContainer uiContainer = new AppContainer();
        Component button1 = new ButtonComponent(uiContainer, "button1");
        Component button2 = new ButtonComponent(uiContainer, "button2");
        Component checkBox1 = new CheckBoxComponent(uiContainer, "checkBox1");
        uiContainer.addComponent(button1);
        uiContainer.addComponent(button2);

        uiContainer.addComponent(checkBox1);
        checkBox1.click();

    }
}
