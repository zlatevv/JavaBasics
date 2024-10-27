import java.util.Scanner;

import static java.lang.System.exit;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tabs = Integer.parseInt(scanner.nextLine());
        double salary = Double.parseDouble(scanner.nextLine());
        boolean noSalary = false;
        for (int i = 0; i < tabs; i++) {
            String tab = scanner.nextLine();
            switch (tab){
                case "Facebook":
                    salary -= 150;
                    break;
                case "Instagram":
                    salary -= 100;
                    break;
                case "Reddit":
                    salary -= 50;
                    break;
            }
            if (salary <= 0){
                System.out.println("You have lost your salary.");
                noSalary = true;
                break;
            }
        }
        if (!noSalary){
            System.out.printf("%.0f", salary);
        }
    }
}
