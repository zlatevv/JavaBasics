import java.util.Scanner;

public class shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double amount = Double.parseDouble(scanner.nextLine());
        double total = 0;
        total = switch (product) {
            case "coffee" -> switch (city) {
                case "Sofia" -> 0.50 * amount;
                case "Plovdiv" -> 0.40 * amount;
                case "Varna" -> 0.45 * amount;
                default -> total;
            };
            case "water" -> switch (city) {
                case "Sofia" -> 0.80 * amount;
                case "Plovdiv" -> 0.70 * amount;
                case "Varna" -> 0.70 * amount;
                default -> total;
            };
            case "beer" -> switch (city) {
                case "Sofia" -> 1.20 * amount;
                case "Plovdiv" -> 1.15 * amount;
                case "Varna" -> 1.10 * amount;
                default -> total;
            };
            case "sweets" -> switch (city) {
                case "Sofia" -> 1.45 * amount;
                case "Plovdiv" -> 1.30 * amount;
                case "Varna" -> 1.35 * amount;
                default -> total;
            };
            case "peanuts" -> switch (city) {
                case "Sofia" -> 1.60 * amount;
                case "Plovdiv" -> 1.50 * amount;
                case "Varna" -> 1.55 * amount;
                default -> total;
            };
            default -> 0;
        };
        System.out.println(total);
    }
}
