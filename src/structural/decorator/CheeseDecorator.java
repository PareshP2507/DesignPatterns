package structural.decorator;

/** Defines description and additional cost for cheese toppings. */
public class CheeseDecorator extends PizzaDecorator {

    public CheeseDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String description() {
        return decoratedPizza.description() + ", cheese";
    }

    @Override
    public int cost() {
        return decoratedPizza.cost() + 2;
    }
}
