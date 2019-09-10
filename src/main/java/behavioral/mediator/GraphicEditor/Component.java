package behavioral.mediator.GraphicEditor;

public abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract void click();

    public abstract void onClick(Component component);
}
