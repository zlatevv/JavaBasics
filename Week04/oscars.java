import java.util.Scanner;

public class oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Double points = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String judge = scanner.nextLine();
            double judgePoints = Double.parseDouble(scanner.nextLine());
            points += (judge.length() * judgePoints) / 2;
            if (points >= 1250.5){
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", name, points);
                break;
            }
        }if (points < 1250.5){
            System.out.printf("Sorry, %s you need %.1f more!", name, 1250.5 - points);
        }
    }
}
