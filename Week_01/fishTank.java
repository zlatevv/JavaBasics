import java.util.Scanner;

public class fishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());
        int volume = length * width * height;
        double litters = volume * 0.001;
        double percentage = percent / 100;
        double neededLitters = litters * (1 - percentage);
        System.out.println(neededLitters);

    }
}
