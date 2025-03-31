package structural.composite;

public class Runner {
    public static void main(String[] args) {
        final Component label = new Label(new InnerText("Hello, World!"));
        final Component input = new Input();
        final Component button = new Button(new InnerText("Click Me!"));

        final Panel panel = new Panel();
        panel.addComponent(label);
        panel.addComponent(input);
        panel.addComponent(button);
        
        System.out.println(panel.render());
    }
}
