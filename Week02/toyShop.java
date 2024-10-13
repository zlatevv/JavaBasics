import java.util.Scanner;

public class toyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double cost = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());
        double totalMoney = puzzles * 2.6 + dolls * 3 + bears * 4.10 + minions * 8.2 + trucks * 2;
        int total = puzzles + dolls + bears + minions + trucks;
        if (total >= 50){
            totalMoney -= totalMoney * 0.25;
        }
        totalMoney -= totalMoney * 0.10;
        if (totalMoney >= cost){
            double remaining = totalMoney - cost;
            System.out.printf("Yes! %.2f lv left.", remaining);
        }else{
            double remaining = cost - totalMoney;
            System.out.printf("Not enough money! %.2f lv needed.", remaining);
        }
    }
}
