import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tournaments = Integer.parseInt(scanner.nextLine());
        int points = Integer.parseInt(scanner.nextLine());
        int won = 0;
        int pointsWon = 0;
        for (int i = 0; i < tournaments; i++) {
            String reachedStage = scanner.nextLine();
            switch (reachedStage){
                case "W":
                    points += 2000;
                    pointsWon += 2000;
                    won++;
                    break;
                case "F":
                    points += 1200;
                    pointsWon += 1200;
                    break;
                case "SF":
                    points += 720;
                    pointsWon += 720;
                    break;
            }
        }
        System.out.printf("Final points: %d%n", points);
        System.out.printf("Average points: %.0f%n", Math.floor((double) pointsWon / tournaments));
        System.out.printf("%.2f%%", (won * 1.0 / tournaments) * 100);
    }
}
