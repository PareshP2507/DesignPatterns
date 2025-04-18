package creational.factory;

/**
 * In factory pattern, this abstract class will act as a 'Creator'. It defines
 * a method create() that will return an instance of Enemy. Concrete factories
 * (like GoblinFactory, OrcFactory) will extend this class and implement the
 * create() method to return specific types of Enemy.
 */
public abstract class EnemyFactory {
    abstract Enemy create();
}
