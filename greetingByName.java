import java.util.Scanner;

 class greetingByName {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         String name = scanner.nextLine();
         System.out.println("Hello, " + name + "!");
     }
}
