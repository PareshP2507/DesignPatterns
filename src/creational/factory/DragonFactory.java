package creational.factory;

public class DragonFactory extends EnemyFactory {
    @Override
    public Enemy create() {
        return new Dragon();
    }
}
