package structural.decorator;

/** Provides basic implementation for the plain pizza */
public class PlainPizza implements Pizza {

    @Override
    public String description() {
        return "Plain Pizza";
    }

    @Override
    public int cost() {
        return 8;
    }
}
