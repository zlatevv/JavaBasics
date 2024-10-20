import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flower = scanner.nextLine();
        int amount = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double price = switch (flower) {
            case "Roses" -> 5;
            case "Dahlias" -> 3.80;
            case "Tulips" -> 2.80;
            case "Narcissus" -> 3;
            case "Gladiolus" -> 2.50;
            default -> 0;
        };
        double cost = price * amount;
        if (flower.equals("Roses") && amount > 80) {
            cost *= 0.90;  // 10% отстъпка
        } else if (flower.equals("Dahlias") && amount > 90) {
            cost *= 0.85;  // 15% отстъпка
        } else if (flower.equals("Tulips") && amount > 80) {
            cost *= 0.85;  // 15% отстъпка
        } else if (flower.equals("Narcissus") && amount < 120) {
            cost *= 1.15;  // 15% оскъпяване
        } else if (flower.equals("Gladiolus") && amount < 80) {
            cost *= 1.20;  // 20% оскъпяване
        }
        if (budget >= cost){
            double left = budget - cost;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", amount, flower, left);
        }else {
            double needed = cost - budget;
            System.out.printf("Not enough money, you need %.2f leva more.", needed);
        }
    }
}
