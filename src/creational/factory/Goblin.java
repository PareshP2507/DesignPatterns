package creational.factory;

public class Goblin implements Enemy {
    @Override
    public void attack() {
        System.out.println("Goblin swings a club!");
    }

    @Override
    public void defend() {
        System.out.println("Goblin hides behind a rock!");
    }
}
