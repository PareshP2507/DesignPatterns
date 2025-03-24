package structural.decorator;

/** Defines description and additional cost for pepperoni toppings. */
public class PepperoniDecorator extends PizzaDecorator {
    
    public PepperoniDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String description() {
        return decoratedPizza.description() + ", pepperoni";
    }

    @Override
    public int cost() {
        return decoratedPizza.cost() + 3;
    }
}
