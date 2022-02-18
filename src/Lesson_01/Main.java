package Lesson_01;

public class Main {
    public static void main (String[] args) {
      Team team = new Team("Гризли");
      Course course = new Course();

      team.teamInfo(team.getTeamName());
        System.out.println("----------------------------------------------------------");
        course.doIt(team.players);
        System.out.println("----------------------------------------------------------");
        team.showResults(course.obstacles);
    }
}
