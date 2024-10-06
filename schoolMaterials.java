import java.util.Scanner;

public class schoolMaterials {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pens = Integer.parseInt(scanner.nextLine());
        int marcers = Integer.parseInt(scanner.nextLine());
        int litters = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());
        double cenaHimikali = 5.80;
        double cenaMarkeri = 7.20;
        double cenaPreparat = 1.20;

        // Изчисляване на общата цена
        double obshtaCenaHimikali = pens * cenaHimikali;
        double obshtaCenaMarkeri = marcers * cenaMarkeri;
        double obshtaCenaPreparat = litters * cenaPreparat;
        double obshtaSuma = obshtaCenaHimikali + obshtaCenaMarkeri + obshtaCenaPreparat;

        // Изчисляване на намалението
        double namalenie = (discount / 100.0) * obshtaSuma;
        double krainaSuma = obshtaSuma - namalenie;
        System.out.println(krainaSuma);

    }
}
