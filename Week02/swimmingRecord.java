import java.util.Scanner;


public class swimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double record = Double.parseDouble(scanner.nextLine());
        double meters = Double.parseDouble(scanner.nextLine());
        double secondsPerMeter = Double.parseDouble(scanner.nextLine());
        double time = meters * secondsPerMeter;
        double number = meters / 15;
        double stun = Math.floor(number) * 12.5;
        double totalTime = time + stun;
        if (record > totalTime){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        }else{
            double seconds = totalTime - record;
            System.out.printf("No, he failed! He was %.2f seconds slower.", seconds);
        }
    }
}
