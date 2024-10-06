import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double depositedAmount = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());
        double AccuratePercent = percent / 100;
        double total = depositedAmount + months * ((depositedAmount * AccuratePercent) / 12);
        System.out.println(total);
    }
}
