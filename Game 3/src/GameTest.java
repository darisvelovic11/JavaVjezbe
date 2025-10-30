//Daris Velovic
//Adelisa Palavrtic

public class GameTest {
    public static void main(String[] args) {
        Player player = new Player(" peTar petrovié ", 10, 5, 32, 32, 85);
        Game game = new Game(player);

        MeleeEnemy goblin = new MeleeEnemy("Goblin", 12, 5, 16, 16, 20, 60);
        BossEnemy boss = new BossEnemy("Goblin King", 12, 5, 32, 32, 25, 120);

        game.addEnemy(goblin);
        game.addEnemy(boss);

        System.out.println("=== Enemies ===");
        game.printEnemies();

        System.out.println("\n=== Find enemies containing 'gob' ===");
        for (Enemy e : game.findByType("gob")) System.out.println(e);

        System.out.println("\n=== Player before collisions ===");
        System.out.println(player);

        game.resolveCollisions();

        System.out.println("\n=== Player after collisions ===");
        System.out.println(player);

        System.out.println("\n=== Event Log ===");
        game.printEventLog();
    }
}
