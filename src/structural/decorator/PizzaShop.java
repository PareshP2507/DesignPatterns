package structural.decorator;

public class PizzaShop {
    public static void main(String[] args) {
        
        Pizza pizza = new PlainPizza();
        System.out.println(pizza.description() + " $" +pizza.cost());

        pizza = new CheeseDecorator(pizza);
        System.out.println(pizza.description() + " $" +pizza.cost());

        pizza = new PepperoniDecorator(pizza);
        System.out.println(pizza.description() + " $" +pizza.cost());

        pizza = new MushroomDecorator(pizza);
        System.out.println(pizza.description() + " $" +pizza.cost());
    }
}
