import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groups = Integer.parseInt(scanner.nextLine());
        int total = 0;
        int musala = 0;
        int monblan = 0;
        int kilimandjaro = 0;
        int K2 = 0;
        int everest = 0;
        for (int i = 0; i < groups; i++) {
            int people = Integer.parseInt(scanner.nextLine());
            total += people;
            if (people <= 5){
                musala += people;

            }else if (people <= 12){
                monblan += people;
            }else if (people <= 25){
                kilimandjaro += people;
            }else if (people <= 40){
                K2 += people;
            }else {
                everest += people;
            }
        }
        System.out.printf("%.2f%%%n", musala * 1.0 / total * 100 );
        System.out.printf("%.2f%%%n", monblan * 1.0 / total * 100 );
        System.out.printf("%.2f%%%n", kilimandjaro * 1.0 / total * 100 );
        System.out.printf("%.2f%%%n", K2 * 1.0 / total * 100 );
        System.out.printf("%.2f%%%n", everest * 1.0 / total * 100 );
    }
}
