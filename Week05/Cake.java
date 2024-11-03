import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int pieces = length * width;
        String input = scanner.nextLine();
        while (!(input.equals("STOP"))){

            int piece = Integer.parseInt(input);
            pieces -= piece;
            if (pieces <= 0){
                int needed = -pieces;
                System.out.printf("No more cake left! You need %d pieces more.", needed);
                return;
            }
            input = scanner.nextLine();
        }
        System.out.printf("%d pieces are left.", pieces);
    }
}
