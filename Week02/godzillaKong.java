import java.util.Scanner;

public class godzillaKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int statist = Integer.parseInt(scanner.nextLine());
        double costCloth = Double.parseDouble(scanner.nextLine());
        double decor = budget * 0.1;
        if (statist > 150){
            costCloth -= costCloth * 0.10;
        }
        double total = statist * costCloth + decor;
        if (budget >= total){
            System.out.println("Action!");
            double left = budget - total;
            System.out.printf("Wingard starts filming with %.2f leva left.", left);
        }else {
            System.out.println("Not enough money!");
            double needed = total - budget;
            System.out.printf("Wingard needs %.2f leva more.", needed);
        }
    }
}
