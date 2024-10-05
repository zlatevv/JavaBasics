import java.util.Scanner;

public class petShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dogPackets = Integer.parseInt(scanner.nextLine());
        int catPackets = Integer.parseInt(scanner.nextLine());
        double dogCost = dogPackets * 2.5;
        double catCost = catPackets * 4;
        double total = dogCost + catCost;
        System.out.println(total + " lv.");
    }
}
