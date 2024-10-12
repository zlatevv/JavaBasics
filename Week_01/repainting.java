import java.util.Scanner;

public class repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nailon = Integer.parseInt(scanner.nextLine());
        int litters = Integer.parseInt(scanner.nextLine());
        int razreditel = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        double sumaNailon = (nailon + 2) * 1.5;
        double sumBoq = (litters + 0.10 * litters) * 14.5;
        double sumRazreditel = razreditel * 5;
        double torbichki = 0.40;
        double materials = sumaNailon + sumBoq + sumRazreditel + torbichki;
        double zaMaistori = (materials * 0.30) * hours;
        double total = materials + zaMaistori;
        System.out.println(total);
    }
}
