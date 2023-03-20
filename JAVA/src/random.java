import java.util.Random;

public class random {
    public static void main(String [] args) {
        Random random = new Random();

        int randomInt = random.nextInt(6)+1;
        double randomeDouble = random.nextDouble(5)+1;
        boolean randomBool = random.nextBoolean();
        double randomS = random.nextGaussian();

        System.out.println("random Integer "+randomInt);
        System.out.println( "random Double " +randomeDouble);
        System.out.println("randome bool "+randomBool);
        System.out.println("random gaussian "+randomS);
    }
}
