package problemandsolutions;

import java.util.Random;

public class RandomNumberGenerate {
    //Write Java program to generate a random number between 1 to 8.
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt(9));
    }

}