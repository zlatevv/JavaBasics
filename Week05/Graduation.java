import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int grade = 1;
        double total = 0;
        int fails = 0;
        int passed = 0;
        while (grade <= 12){
            double YearGrade = Double.parseDouble(scanner.nextLine());

            if (YearGrade >= 4.00){
                grade++;
                passed++;
                total += YearGrade;
            }else{
                fails++;
                if (fails > 1){
                    System.out.printf("%s has been excluded at %d grade", name, grade);
                    return;
                }
            }

        }
        double average = total / passed;
        System.out.printf("%s graduated. Average grade: %.2f", name, average);
    }
}
