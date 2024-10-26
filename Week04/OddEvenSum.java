import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int oddSum = 0;
        int evenSum = 0;
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(scanner.nextLine());
            if (i % 2 == 0){
                evenSum += a;
            }else{
                oddSum += a;
            }
        }if (oddSum == evenSum){
            System.out.printf("Yes\nSum = %d", evenSum);
        }else {
            System.out.printf("No\nDiff = %d", Math.abs(oddSum - evenSum));
        }
    }
}