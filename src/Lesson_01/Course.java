package Lesson_01;

public class Course {
    String[] obstacles = {"стена", "забор", "горка", "канава с водой", "параллельные брусья"};

    public void doIt (String[] players) {
        for (int i = 0; i < obstacles.length; i++) {
            for (int y = 0; y < players.length; y++)
            System.out.print(players[y] + " пытается преодолеть препятствие " + obstacles[i] + "\n");
        }
        System.out.println();
    }
}
