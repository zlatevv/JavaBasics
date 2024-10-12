import java.util.Scanner;

public class areaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figure = scanner.nextLine();
        if (figure.equals("square")){
            double side = Double.parseDouble(scanner.nextLine());
            double S = side * side;
            System.out.printf("%.3f%n", S);
        }else if (figure.equals("rectangle")){
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            double S = a * b;
            System.out.printf("%.3f%n", S);
        }else if (figure.equals("circle")){
            double radius = Double.parseDouble(scanner.nextLine());
            double S = radius * radius * Math.PI;
            System.out.printf("%.3f%n", S);
        }else if (figure.equals("triangle")) {
            double side = Double.parseDouble(scanner.nextLine());
            double height = Double.parseDouble(scanner.nextLine());
            double S = (side * height) / 2;
            System.out.printf("%.3f%n", S);
        }
        scanner.close();
    }
}
