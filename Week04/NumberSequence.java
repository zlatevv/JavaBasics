import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(scanner.nextLine());
            if (a > max){
                max = a;
            }if (a < min){
                min = a;
            }
        }
        System.out.printf("Max number: %d\n", max);
        System.out.printf("Min number: %d", min);
    }
}