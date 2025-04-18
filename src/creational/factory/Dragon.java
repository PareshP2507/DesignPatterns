package creational.factory;

public class Dragon implements Enemy {
    @Override
    public void attack() {
        System.out.println("Dragon breathes fire!");
    }

    @Override
    public void defend() {
        System.out.println("Dragon shields with its wings!");
    }
    
}
