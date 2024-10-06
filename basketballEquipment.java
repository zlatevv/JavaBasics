import java.util.Scanner;

public class basketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tax = Integer.parseInt(scanner.nextLine());
        double shoes = tax - tax * 0.4;
        double ekip = shoes - shoes * 0.20;
        double ball = ekip - ekip * 0.75;
        double accessories = ball - ball * 0.80;
        double total = tax + shoes + ekip + ball + accessories;
        System.out.println(total);
    }
}
