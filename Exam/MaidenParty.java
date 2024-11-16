import java.util.Scanner;

public class MaidenParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double partyCost = Double.parseDouble(scanner.nextLine());
        int loveTexts = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int keys = Integer.parseInt(scanner.nextLine());
        int karikatura = Integer.parseInt(scanner.nextLine());
        int luckSurprises = Integer.parseInt(scanner.nextLine());
        int total = loveTexts + roses + keys + karikatura + luckSurprises;
        double loveCost = loveTexts * 0.6;
        double roseCost = roses * 7.2;
        double keyCost = keys * 3.6;
        double karikaturaCost = karikatura * 18.2;
        int luckCost = luckSurprises * 22;
        double totalCost = loveCost + roseCost + karikaturaCost + keyCost + luckCost;
        if (total >= 25){
            totalCost -= totalCost * 0.35;
        }
        totalCost -= totalCost * 0.1;
        if (totalCost >= partyCost){
            System.out.printf("Yes! %.2f lv left.", totalCost - partyCost);
        }else {
            System.out.printf("Not enough money! %.2f lv needed.", partyCost - totalCost);
        }
    }
}
