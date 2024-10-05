import java.util.Scanner;
public class area {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int width = Integer.parseInt(a.nextLine());
        int length = Integer.parseInt(a.nextLine());
        System.out.println(width * length);
    }
}
