import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int degrees = Integer.parseInt(scanner.nextLine());
        String time = scanner.nextLine();
        String outfit = "";
        String shoes = "";
        switch (time){
            case "Morning":
                if (10 <= degrees && degrees <= 18){
                    outfit = "Sweatshirt";
                    shoes = "Sneakers";
                }else if (18 < degrees && degrees <= 24){
                    outfit = "Shirt";
                    shoes = "Moccasins";
                }else if(degrees >= 25){
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                }break;
            case "Afternoon":
                if (10 <= degrees && degrees <= 18){
                    outfit = "Shirt";
                    shoes = "Moccasins";
                }else if (18 < degrees && degrees <= 24){
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                }else if(degrees >= 25){
                    outfit = "Swim Suit";
                    shoes = "Barefoot";
                }break;
            case "Evening":
                if (10 <= degrees && degrees <= 18){
                    outfit = "Shirt";
                    shoes = "Moccasins";
                }else if (18 < degrees && degrees <= 24){
                    outfit = "Shirt";
                    shoes = "Moccasins";
                }else if(degrees >= 25){
                    outfit = "Shirt";
                    shoes = "Moccasins";
                }break;
        }
        System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
    }
}
