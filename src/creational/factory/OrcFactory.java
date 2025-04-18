package creational.factory;

public class OrcFactory extends EnemyFactory {
    @Override
    public Enemy create() {
        return new Orc();
    }
}
