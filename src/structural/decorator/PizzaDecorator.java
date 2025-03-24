package structural.decorator;

/**
 * Class works as an abstract decorator. It implements {@link Pizza} and holds a
 * reference to a Pizza object. It delegates operations to the wrapped
 * {@link Pizza} object.
 */
public abstract class PizzaDecorator implements Pizza {

    protected Pizza decoratedPizza;

    public PizzaDecorator(Pizza decoratedPizza) {
        this.decoratedPizza = decoratedPizza;
    }

    @Override
    public String description() {
        return decoratedPizza.description();
    }

    @Override
    public int cost() {
        return decoratedPizza.cost();
    }
}
