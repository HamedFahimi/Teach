import java.util.Random;

public class RandomGeneration {
    public static void main(String[] args) {
        Random die = new Random();
        for (int i = 0; i < 10; i++) {
            int dice = die.nextInt(100) + 1;
            System.out.println(" i = " + i + " -> dice = " + dice);
        }
    }
}

