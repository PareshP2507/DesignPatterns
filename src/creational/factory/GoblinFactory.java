package creational.factory;

public class GoblinFactory extends EnemyFactory {
    @Override
    public Enemy create() {
        return new Goblin();
    }
}
