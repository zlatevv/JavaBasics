import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Четене на входните данни
        int days = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String review = scanner.nextLine();

        // Брой нощувки
        int nights = days - 1;

        // Цена за нощувка
        double pricePerNight = 0.0;

        // Определяне на базовата цена в зависимост от вида на помещението
        switch (roomType) {
            case "room for one person":
                pricePerNight = 18.00;
                break;
            case "apartment":
                pricePerNight = 25.00;
                break;
            case "president apartment":
                pricePerNight = 35.00;
                break;
        }

        // Изчисляване на крайната цена
        double totalPrice = nights * pricePerNight;

        // Прилагане на намаление в зависимост от броя на нощувките и типа стая
        if (roomType.equals("apartment")) {
            if (days < 10) {
                totalPrice *= 0.70;  // 30% намаление
            } else if (days <= 15) {
                totalPrice *= 0.65;  // 35% намаление
            } else {
                totalPrice *= 0.50;  // 50% намаление
            }
        } else if (roomType.equals("president apartment")) {
            if (days < 10) {
                totalPrice *= 0.90;  // 10% намаление
            } else if (days <= 15) {
                totalPrice *= 0.85;  // 15% намаление
            } else {
                totalPrice *= 0.80;  // 20% намаление
            }
        }

        // Прилагане на оценката
        if (review.equals("positive")) {
            totalPrice *= 1.25;  // 25% увеличение
        } else if (review.equals("negative")) {
            totalPrice *= 0.90;  // 10% намаление
        }

        // Отпечатване на крайната цена, форматирана до втория знак след запетаята
        System.out.printf("%.2f%n", totalPrice);
    }
}
