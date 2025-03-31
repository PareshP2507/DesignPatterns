package structural.composite;

public class Button implements Component {

    private final InnerText innerText;

    public Button(InnerText innerText) {
        this.innerText = innerText;
    }

    @Override
    public String render() {
        return "<button>" + innerText.render() + "</button>";
    }
    
}
