package structural.decorator;

/** Defines description and additional cost for mushroom toppings. */
public class MushroomDecorator extends PizzaDecorator {
    
    public MushroomDecorator(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String description() {
        return decoratedPizza.description() + ", mushroom";
    }

    @Override
    public int cost() {
        return decoratedPizza.cost() + 1;
    }
}
