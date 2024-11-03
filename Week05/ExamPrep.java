import java.util.Scanner;

public class ExamPrep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int allowedFails = Integer.parseInt(scanner.nextLine());
        int fails = 0;
        double totalGrade = 0;
        int problems = 0;
        String lastProblem = "";
        while (fails < allowedFails){
            String name = scanner.nextLine();
            if (name.equals("Enough")){
                double average = totalGrade / problems;
                System.out.printf("Average score: %.2f%n", average);
                System.out.printf("Number of problems: %d%n", problems);
                System.out.printf("Last problem: %s", lastProblem);
                return;
            }
            int grade = Integer.parseInt(scanner.nextLine());
            if (grade <= 4){
                fails++;
            }
            lastProblem = name;
            totalGrade += grade;
            problems++;
        }
        System.out.printf("You need a break, %d poor grades.", allowedFails);
    }
}
