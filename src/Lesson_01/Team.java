package Lesson_01;

import java.util.Random;

public class Team {
    private String teamName;
    String[] players = {"Петя", "Вася", "Саша", "Антон"};
    Random random = new Random();
    boolean rand;

    public Team (String teamName) {
        this.teamName = teamName;
    }

    public void teamInfo () {
        System.out.print("Состав команды: ");
        for(int i = 0; i < players.length; i++) {
            System.out.print(players[i]);
            if (i != players.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public void showResults (String[] obstacles) {
        for(int i = 0; i < players.length; i++) {
            for (int y = 0; y < obstacles.length; y++) {
                rand = random.nextBoolean();
                if (rand) {
                    System.out.print(players[i] + " преодолел препятствие: " + obstacles[y] + "\n");
                } else {
                    System.out.print(players[i] + " не смог преодолеть препятствие: " + obstacles[y] + "\n");
                }
            }
        }
    }
}
