import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String day = scanner.nextLine();
        double amount = Double.parseDouble(scanner.nextLine());
        double price = 0;
        boolean isValid = true;
        switch (day){
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                switch (product) {
                    case "banana":
                        price = 2.5;
                        break;
                    case "apple":
                        price = 1.2;
                        break;
                    case "orange":
                        price = 0.85;
                        break;
                    case "grapefruit":
                        price = 1.45;
                        break;
                    case "kiwi":
                        price = 2.7;
                        break;
                    case "pineapple":
                        price = 5.5;
                        break;
                    case "grapes":
                        price = 3.85;
                        break;
                    default:
                        System.out.println("error");
                        isValid = false;
                        break;
                }break;
            case "Saturday":
            case "Sunday":
                switch (product) {
                    case "banana":
                        price = 2.7;
                        break;
                    case "apple":
                        price = 1.25;
                        break;
                    case "orange":
                        price = 0.90;
                        break;
                    case "grapefruit":
                        price = 1.60;
                        break;
                    case "kiwi":
                        price = 3;
                        break;
                    case "pineapple":
                        price = 5.6;
                        break;
                    case "grapes":
                        price = 4.20;
                        break;
                    default:
                        System.out.println("error");
                        isValid = false;
                }
        }if (isValid){
            double total = amount * price;
            System.out.printf("%.2f", total);
        }
    }
}
