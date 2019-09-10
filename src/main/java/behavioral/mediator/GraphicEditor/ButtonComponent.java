package behavioral.mediator.GraphicEditor;

public class ButtonComponent extends Component {

    private UIContainer container;

    public ButtonComponent(UIContainer uiContainer, String name) {
        super(name);
        this.container = uiContainer;
    }

    @Override
    public void click() {
        System.out.println("Click on: " + name);
        container.onComponentClick(this);
    }

    @Override
    public void onClick(Component component) {
        System.out.println(name + ": " + component.name + " was clicked");
    }
}
