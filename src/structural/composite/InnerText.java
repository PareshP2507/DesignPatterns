package structural.composite;

public class InnerText implements Component {

    private String text;

    public InnerText(String text) {
        this.text = text;
    }

    @Override
    public String render() {
        return text;
    }
}
