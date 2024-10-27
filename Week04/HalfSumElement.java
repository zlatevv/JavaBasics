import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int sumW = 0;
        int maxNum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(scanner.nextLine());
            sum += a;
            if (a > maxNum){
                maxNum = a;
            }
        sumW = sum - maxNum;
        }if (maxNum == sumW){
            System.out.printf("Yes\nSum = %d", sumW);
        }else{
            System.out.printf("No\nDiff = %d", Math.abs(maxNum - sumW));
        }
    }
}
