import java.util.Scanner;

public class OnTimeForExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinute = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMinute = Integer.parseInt(scanner.nextLine());

        int examTimeInMinutes = examHour * 60 + examMinute;
        int arrivalTimeInMinutes = arrivalHour * 60 + arrivalMinute;

        int difference = arrivalTimeInMinutes - examTimeInMinutes;

        if (difference < -30) {
            System.out.println("Early");
            int absDifference = Math.abs(difference);
            if (absDifference >= 60) {
                int hours = absDifference / 60;
                int minutes = absDifference % 60;
                System.out.printf("%d:%02d hours before the start%n", hours, minutes);
            } else {
                System.out.printf("%d minutes before the start%n", absDifference);
            }
        } else if (difference <= 0) {
            System.out.println("On time");
            if (difference != 0) {
                int absDifference = Math.abs(difference);
                System.out.printf("%d minutes before the start%n", absDifference);
            }
        } else {
            System.out.println("Late");
            if (difference >= 60) {
                int hours = difference / 60;
                int minutes = difference % 60;
                System.out.printf("%d:%02d hours after the start%n", hours, minutes);
            } else {
                System.out.printf("%d minutes after the start%n", difference);
            }
        }
    }
}
