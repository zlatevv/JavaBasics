import java.util.Scanner;

public class Hristogram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(scanner.nextLine());
            if (a < 200){
                p1++;
            }else if (a <= 399) {
                p2++;
            }else if (a <= 599) {
                p3++;
            }else if (a <= 799) {
                p4++;
            }else{
                p5++;
            }
        }
        double percent1 = (p1 * 1.0/ n) * 100;
        double percent2 = (p2 * 1.0/ n) * 100;
        double percent3 = (p3 * 1.0/ n) * 100;
        double percent4 = (p4 * 1.0/ n) * 100;
        double percent5 = (p5 * 1.0/ n) * 100;
        System.out.printf("%.2f%%%n", percent1);
        System.out.printf("%.2f%%%n", percent2);
        System.out.printf("%.2f%%%n", percent3);
        System.out.printf("%.2f%%%n", percent4);
        System.out.printf("%.2f%%%n", percent5);
    }
}
