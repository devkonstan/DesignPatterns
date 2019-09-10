package behavioral.mediator.GraphicEditor;

import java.util.ArrayList;
import java.util.List;

public class AppContainer implements UIContainer {

    private List<Component> components = new ArrayList<>();

    @Override
    public void onComponentClick(Component clickedComponent) {
        for (Component component : components) {
            if (component != clickedComponent) {
                component.onClick(clickedComponent);
            }
        }
    }

    @Override
    public void addComponent(Component component) {
        components.add(component);
    }
}
