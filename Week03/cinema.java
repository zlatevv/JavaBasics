import java.util.Scanner;

public class cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());
        double ticket = switch (type) {
            case "Premiere" -> 12;
            case "Normal" -> 7.5;
            case "Discount" -> 5;
            default -> 0;
        };
        double total = ticket * rows * cols;
        System.out.printf("%.2f leva", total);
    }
}
