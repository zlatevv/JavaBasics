import java.util.Scanner;

public class shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        double videocards = Double.parseDouble(scanner.nextLine());
        double processors = Double.parseDouble(scanner.nextLine());
        double RAM = Double.parseDouble(scanner.nextLine());
        double videocardCost = videocards * 250;
        double processorCost = videocardCost * 0.35 * processors;
        double RAMcost = videocardCost * 0.10 * RAM;
        double total = videocardCost + processorCost + RAMcost;
        if (videocards > processors){
            total -= total * 0.15;
        }
        if (budget >= total){
            double left = budget - total;
            System.out.printf("You have %.2f leva left!", left);
        }else{
            double left = total - budget;
            System.out.printf("Not enough money! You need %.2f leva more!", left);
        }
    }
}
