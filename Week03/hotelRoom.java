import java.util.Scanner;

public class hotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double studioCost = 0;
        double apartmentCost = 0;
        switch (month) {
            case "May":
            case "October":
                studioCost = 50 * nights;
                apartmentCost = 65 * nights;
                if (nights > 7 && nights <= 14){
                    studioCost -= studioCost * 0.05;
                }else if(nights > 14){
                    studioCost -= studioCost * 0.3;
                }
                break;
            case "June":
            case "September":
                studioCost = 75.20 * nights;
                apartmentCost = 68.70 * nights;
                if (nights > 14){
                    studioCost -= studioCost * 0.2;
                }
                break;
            case "July":
            case "August":
                studioCost = 76 * nights;
                apartmentCost = 77 * nights;
                break;
        }if (nights > 14){
            apartmentCost -= apartmentCost * 0.1;
        }
        System.out.printf("Apartment: %.2f lv.\n", apartmentCost);
        System.out.printf("Studio: %.2f lv.", studioCost);
    }
}
