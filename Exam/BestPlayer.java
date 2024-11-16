import java.util.Scanner;

public class BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String maxPlayer = "";
        int maxGoals = 0;
        while (!(name.equals("END"))){
            int goals = Integer.parseInt(scanner.nextLine());
            if (goals > maxGoals){
                maxPlayer = name;
                maxGoals = goals;
                if (goals >= 10){
                    break;
                }
            }
            name = scanner.nextLine();
        }
        System.out.printf("%s is the best player!%n", maxPlayer);
        if (maxGoals >= 3){
            System.out.printf("He has scored %d goals and made a hat-trick !!!", maxGoals);
        }else{
            System.out.printf("He has scored %d goals.", maxGoals);
        }
    }
}
