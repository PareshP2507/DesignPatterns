package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Panel implements Component {

    private List<Component> components;

    public Panel() {
        this.components = new ArrayList<>();
    }
    
    public void addComponent(Component component) {
        components.add(component);
    }

    @Override
    public String render() {
        StringBuilder sb = new StringBuilder();
        sb.append("<div>");
        sb.append("\n");
        for (Component component : components) {
            sb.append(component.render());
            sb.append("\n");
        }
        sb.append("</div>");
        return sb.toString();
    }
    
}
