import java.util.Scanner;

public class concatenateData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String surname = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String town = scanner.nextLine();
        System.out.println("You are " + name + " " + surname + ", a " + age + "-years old person from " + town + ".");
    }
}
