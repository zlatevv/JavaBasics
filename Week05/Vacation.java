import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vacationMoney = Double.parseDouble(scanner.nextLine());
        double money = Double.parseDouble(scanner.nextLine());
        int days = 1;
        int daysInRow = 0;
        while (true){
            String activity = scanner.nextLine();
            double sum = Double.parseDouble(scanner.nextLine());
            if (activity.equals("spend")){
                daysInRow++;
                if (daysInRow == 5){
                    System.out.println("You can't save the money.");
                    System.out.println(days);
                    break;
                }if (sum >= money){
                    money = 0;
                }else{
                    money -= sum;
                }
            }else{
                money += sum;
                daysInRow = 0;
                if (money >= vacationMoney){
                    System.out.printf("You saved the money for %d days.", days);
                    break;
                }
            }
            days++;
        }
    }
}
