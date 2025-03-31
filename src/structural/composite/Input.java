package structural.composite;

public class Input implements Component {

    @Override
    public String render() {
        return "<input type=\"text\" />";
    }
}
