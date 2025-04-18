package creational.factory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Game {
    
    private final EnemyFactory enemyFactory;
    private final List<Enemy> enemies = new CopyOnWriteArrayList<>();

    public Game(EnemyFactory enemyFactory) {
        this.enemyFactory = enemyFactory;
    }

    public void spawnEnemies(int count) {
        for (int i = 0; i < count; i++) {
            enemies.add(enemyFactory.create());
        }
    }

    public void start() {
        while (true) {
            for (var enemy : enemies) {
                enemy.attack();
            }
        }
    }
}
