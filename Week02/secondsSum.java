import java.util.Scanner;

public class secondsSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());
        int total = first + second + third;
        int minutes = total / 60;
        int seconds = total % 60;
        System.out.printf("%d:%02d", minutes, seconds);

    }
}
