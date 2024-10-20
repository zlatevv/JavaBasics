import java.util.Scanner;

public class operations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Integer.parseInt(scanner.nextLine());
        double b = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        String type = "";
        double total = 0;
        switch (operator){
            case "+":
                total = a + b;
                if (total %  2 == 0){
                    type = "even";
                }else {
                    type = "odd";
                }
                System.out.printf("%.0f + %.0f = %.0f - %s", a, b, total, type);
                break;
            case "-":
                total = a - b;
                if (total %  2 == 0){
                    type = "even";
                }else {
                    type = "odd";
                }
                System.out.printf("%.0f - %.0f = %.0f - %s", a, b, total, type);
                break;
            case "*":
                total = a * b;
                if (total %  2 == 0){
                    type = "even";
                }else {
                    type = "odd";
                }
                System.out.printf("%.0f * %.0f = %.0f - %s", a, b, total, type);
                break;
            case "/":
                if (b != 0) {
                    total = a/ b;
                    System.out.printf("%.0f / %.0f = %.2f", a, b, total);
                }else{
                    System.out.printf("Cannot divide %.0f by zero", a);
                }break;
            case "%":
                if (b != 0) {
                    total = a % b;
                    System.out.printf("%.0f %s %.0f = %.0f", a,operator, b, total);
                }else{
                    System.out.printf("Cannot divide %.0f by zero", a);
                }break;
        }
    }
}
