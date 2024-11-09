import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int begin = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());
        int combinations = 0;
        boolean found = false;
        for (int i = begin; i <= end; i++) {
            for (int j = begin; j <= end; j++) {
                combinations++;
                if (i + j == magicNum){
                    System.out.printf("Combination N:%d (%d + %d = %d)%n", combinations, i, j, magicNum);
                    found = true;
                }
            }if (found){
                break;
            }
        }if (!found){
            System.out.printf("%d combinations - neither equals %d", combinations, magicNum);
        }
    }
}
