import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        double total = 0;
        while (!(n.equals("NoMoreMoney"))){
            double amount = Double.parseDouble(n);
            if (amount <= 0){
                System.out.println("Invalid operation!");
                break;
            }
            System.out.printf("Increase: %.2f%n", amount);
            total += amount;
            n = scanner.nextLine();
        }
        System.out.printf("Total: %.2f", total);
    }
}
