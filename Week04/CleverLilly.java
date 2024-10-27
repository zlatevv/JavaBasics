import java.util.Scanner;

public class CleverLilly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double washingMachinePrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        int toyCount = 0;
        double savedMoney = 0;
        double birthdayMoney = 10;

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                savedMoney += birthdayMoney;
                savedMoney--;
                birthdayMoney += 10;
            } else {
                toyCount++;
            }
        }

        savedMoney += toyCount * toyPrice;
        if (savedMoney >= washingMachinePrice) {
            System.out.printf("Yes! %.2f%n", savedMoney - washingMachinePrice);
        } else {
            System.out.printf("No! %.2f%n", washingMachinePrice - savedMoney);
        }
    }
}
