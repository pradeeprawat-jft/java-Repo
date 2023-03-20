public class swap {

    public static void main(String [] args) {
        int x = 0;
        int y = 1;
        System.out.println("Value of X: " + x);
        System.out.println("Value of Y: " + y);

        int temp = -1;
        System.out.println("Swaping........");

        temp = x;
        x = y;
        y = temp;
        System.out.println("Value of X: " + x);
        System.out.println("Value of Y: " + y);

    }
}
