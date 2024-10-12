import java.util.Scanner;

public class foodDelievery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chicken = Integer.parseInt(scanner.nextLine());
        int fish = Integer.parseInt(scanner.nextLine());
        int vegetarian = Integer.parseInt(scanner.nextLine());
        double chickenCost = chicken * 10.35;
        double fishCost = fish * 12.4;
        double VegeterianCost = vegetarian * 8.15;
        double total = chickenCost + fishCost + VegeterianCost;
        double dessert = total * 0.20;
        double finalCost = dessert + total + 2.5;
        System.out.println(finalCost);
    }
}
