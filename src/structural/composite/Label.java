package structural.composite;

public class Label implements Component {
    private final InnerText innerText;

    public Label(InnerText innerText) {
        this.innerText = innerText;
    }

    @Override
    public String render() {
        return "<label>" + innerText.render() + "</label>";
    }
}
