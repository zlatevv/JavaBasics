import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int step = 0;
        while (step < 10000){
            String input = scanner.nextLine();

            if (input.equals("Going home")){
                int steps = Integer.parseInt(scanner.nextLine());
                step += steps;
                break;
            }
            int steps = Integer.parseInt(input);
            step += steps;
        }
        if (step >= 10000){
            int difference = step - 10000;
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", difference);
        }else{
            System.out.printf("%d more steps to reach goal.", 10000 - step);
        }
    }
}
