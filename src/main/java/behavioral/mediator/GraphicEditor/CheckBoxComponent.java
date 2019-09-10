package behavioral.mediator.GraphicEditor;

public class CheckBoxComponent extends Component {

    private UIContainer container;

    public CheckBoxComponent(UIContainer uiContainer, String name) {
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