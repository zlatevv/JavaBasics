import java.util.Scanner;

public class TradeComissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());
        double percentCommission = 0;
        boolean isValid = true;
        switch (name){
            case "Sofia":
                if (0 <= sales && sales <= 500){
                    percentCommission = 5;
                }else if (500 < sales && sales <= 1000){
                    percentCommission = 7;
                }else if (1000 < sales && sales <= 10000){
                    percentCommission = 8;
                }else if (10000 < sales){
                    percentCommission = 12;
                }else {
                    isValid = false;
                    System.out.println("error");
                }break;
            case "Varna":
                if (0 <= sales && sales <= 500){
                    percentCommission = 4.5;
                }else if (500 < sales && sales <= 1000){
                    percentCommission = 7.5;
                }else if (1000 < sales && sales <= 10000){
                    percentCommission = 10;
                }else if (10000 < sales){
                    percentCommission = 13;
                }else {
                    isValid = false;
                    System.out.println("error");
                }break;
            case "Plovdiv":
                if (0 <= sales && sales <= 500){
                    percentCommission = 5.5;
                }else if (500 < sales && sales <= 1000){
                    percentCommission = 8;
                }else if (1000 < sales && sales <= 10000){
                    percentCommission = 12;
                }else if (10000 < sales){
                    percentCommission = 14.5;
                }else {
                    isValid = false;
                    System.out.println("error");
                }break;
            default:
                isValid = false;
                System.out.println("error");
        }
        if (isValid) {
            double s = sales * (percentCommission / 100);
            System.out.printf("%.2f", s);
        }
    }
}
