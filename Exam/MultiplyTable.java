import java.util.Scanner;

public class MultiplyTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int firstNum = number / 100;
        int secondNum = (number / 10) % 10;
        int thirdNum = number % 10;
        for (int i = 1; i <= thirdNum; i++) {
            for (int j = 1; j <= secondNum; j++) {
                for (int k = 1; k <= firstNum; k++) {
                    System.out.printf("%d * %d * %d = %d;%n", i, j, k, i * j * k);
                }
            }
        }
    }
}
