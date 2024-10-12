import java.util.Arrays;
import java.util.Random;

public class area {

    public static void main(String[] args) {

        System.out.println("\nFind MIN and MAX");

        int n = 10;
        int[] myArray = new Random().ints(n, 1,50).toArray();
        System.out.println(Arrays.toString(myArray));

        int MIN = myArray[0];
        int MAX = myArray[0];

        for (int i = 1; i < n; i ++) {
            if (myArray[i] > MAX){
                MAX = myArray[i];
            }
            if (myArray[i] < MIN){
                MIN = myArray[i];

            }

        }
        System.out.println("MAX is " + MAX);
        System.out.println("MIN is " + MIN);


    }






}