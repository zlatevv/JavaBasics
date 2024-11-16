import java.util.Scanner;

public class CourierExpress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight = Double.parseDouble(scanner.nextLine());
        String service = scanner.nextLine();
        int distance = Integer.parseInt(scanner.nextLine());
        double pricePerKilometer = 0;
        if (weight < 1){
            pricePerKilometer = 0.03;
        } else if (weight < 10) {
            pricePerKilometer = 0.05;
        }else if (weight < 40) {
            pricePerKilometer = 0.1;
        }else if (weight < 90) {
            pricePerKilometer = 0.15;
        }else if (weight < 150) {
            pricePerKilometer = 0.2;
        }
        double basePrice = distance * pricePerKilometer;


        double totalPrice = basePrice;
        if (service.equals("express")) {
            double surchargeRate;
            if (weight < 1) {
                surchargeRate = 0.80;
            } else if (weight < 10) {
                surchargeRate = 0.40;
            } else if (weight < 40) {
                surchargeRate = 0.05;
            } else if (weight < 90) {
                surchargeRate = 0.02;
            } else {
                surchargeRate = 0.01;
            }
            double surcharge = weight * pricePerKilometer * surchargeRate * distance;
            totalPrice += surcharge;
        }
        System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.", weight, totalPrice);
    }
}
