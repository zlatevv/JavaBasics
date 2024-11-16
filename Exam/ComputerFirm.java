import java.util.Scanner;

public class ComputerFirm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double totalSales = 0;
        int totalRating = 0;
        for (int i = 0; i < n; i++) {
            int pc = Integer.parseInt(scanner.nextLine());
            int rating = pc % 10;
            int computers = pc / 10;
            double sales = 0;
            switch (rating){
                case 3:
                    sales = computers * 0.5;
                    break;
                case 4:
                    sales = computers * 0.7;
                    break;
                case 5:
                    sales = computers * 0.85;
                    break;
                case 6:
                    sales = computers;
            }
            totalSales += sales;
            totalRating += rating;

        }
        double avgRating = (double) totalRating / n;
        System.out.printf("%.2f%n", totalSales);
        System.out.printf("%.2f", avgRating);
    }
}
