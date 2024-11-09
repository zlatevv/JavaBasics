import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            String destination = scanner.nextLine();
            if (destination.equals("End")){
                break;
            }
            double needed = Double.parseDouble(scanner.nextLine());
            double money = 0;
            while (money < needed){
                double cash = Double.parseDouble(scanner.nextLine());
                money += cash;
            }
            System.out.printf("Going to %s!%n", destination);
        }
    }
}
