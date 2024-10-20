import java.util.Scanner;

public class fishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermen = Integer.parseInt(scanner.nextLine());
        double cost = switch (season) {
            case "Spring" -> 3000;
            case "Summer" -> 4200;
            case "Autumn" -> 4200;
            case "Winter" -> 2600;
            default -> 0;
        };
        if (fishermen <= 6){
            cost -= cost * 0.1;
        }else if (7 < fishermen && fishermen <= 11){
            cost -= cost * 0.15;
        }else {
            cost -= cost * 0.25;
        }
        if (fishermen % 2 == 0 && (!season.equals("Autumn"))){
            cost -= cost * 0.05;
        }if (budget >= cost){
            double left = budget - cost;
            System.out.printf("Yes! You have %.2f leva left.",left);
        }else {
            double needed = cost - budget;
            System.out.printf("Not enough money! You need %.2f leva.", needed);
        }
    }
}
