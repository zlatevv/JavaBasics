import java.util.Arrays;
import java.util.Random;

public class minMax {
    public static void main(String[] args){
        System.out.println("Find MIN and MAX");

        int [] myArray = new Random().ints(10, 1, 50).toArray();

        System.out.println("My array is" + Arrays.toString(myArray));

        int MIN = myArray[0];
        int MAX = myArray[0];

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > MAX){
                MAX = myArray[i];
            }
            if (myArray[i] < MIN){
                MIN = myArray[i];

            }

        }
        System.out.println("MAX is" + MAX);
        System.out.println("MIN is" + MIN);


    }
}