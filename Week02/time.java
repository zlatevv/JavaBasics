import java.util.Scanner;

public class time {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        minutes += 15;
        if (minutes >= 60){
            int hours = minutes / 60;
            minutes = minutes % 60;
            hour += hours;
        }if (hour > 23){
            hour -= 24;
        }
        System.out.printf("%d:%02d", hour, minutes);
    }
}
