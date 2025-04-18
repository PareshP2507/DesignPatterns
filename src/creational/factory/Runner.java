package creational.factory;

import java.util.List;

public class Runner {

    private static final String EASY = "easy";
    private static final String MEDIUM = "medium";
    private static final String HARD = "hard";

    public static void main(String[] args) {
        List<String> difficultyLevels = List.of(EASY, MEDIUM, HARD);

        // Pick a random level from difficultyLevels
        String level = difficultyLevels.get((int) (Math.random() * difficultyLevels.size()));

        EnemyFactory enemyFactory;
        if (level.equals(EASY)) {
            enemyFactory = new GoblinFactory();
        } else if (level.equals(MEDIUM)) {
            enemyFactory = new OrcFactory();
        } else if (level.equals(HARD)) {
            enemyFactory = new DragonFactory();
        } else {
            throw new IllegalArgumentException("Unknown difficulty level: " + level);
        }

        var game = new Game(enemyFactory);
        new Thread(game::start).start();
        game.spawnEnemies(10);
    }
}
