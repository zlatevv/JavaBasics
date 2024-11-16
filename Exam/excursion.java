import java.util.Scanner;

public class excursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        int transportCards = Integer.parseInt(scanner.nextLine());
        int tickets = Integer.parseInt(scanner.nextLine());
        int nightCost = nights * 20;
        double cardCost = transportCards * 1.6;
        int ticketCost = 6 * tickets;
        double total = (nightCost + cardCost + ticketCost) * people;
        total += total * 0.25;
        System.out.printf("%.2f", total);
    }
}
