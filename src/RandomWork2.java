import java.util.Random;

public class RandomWork2 {
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println(rand.nextInt(50,61));

        int r = (int) (Math.random() * (60 - 50)) + 50;
        System.out.println(r);
    }
}
