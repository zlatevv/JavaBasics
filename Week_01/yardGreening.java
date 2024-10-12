import java.util.Scanner;

public class yardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double meters = Double.parseDouble(scanner.nextLine());
        double total = meters * 7.61;
        double discount = total * 0.18;
        double finalCost = total - discount;
        System.out.println("The final price is: " + finalCost);
        System.out.println("The discount is: " + discount);
    }
}