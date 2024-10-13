import java.util.Scanner;

public class lunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Входни данни
        String seriesName = scanner.nextLine();
        int episodeDuration = Integer.parseInt(scanner.nextLine());
        int breakDuration = Integer.parseInt(scanner.nextLine());

        // Изчисляване на времето за обяд и времето за отдих
        double lunchTime = breakDuration / 8.0;
        double restTime = breakDuration / 4.0;

        // Свободно време за гледане на епизода
        double remainingTime = breakDuration - lunchTime - restTime;

        // Проверка дали времето е достатъчно
        if (remainingTime >= episodeDuration) {
            double freeTime = Math.ceil(remainingTime - episodeDuration);
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.%n", seriesName, freeTime);
        } else {
            double neededTime = Math.ceil(episodeDuration - remainingTime);
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.%n", seriesName, neededTime);
        }
    }
}
