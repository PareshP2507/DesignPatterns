package creational.factory;

public class Orc implements Enemy {
    @Override
    public void attack() {
        System.out.println("Orc swings a battle axe!");
    }

    @Override
    public void defend() {
        System.out.println("Orc raises a shield!");
    }
}
