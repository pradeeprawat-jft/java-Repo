import java.util.Scanner;

public class mathClass {
    public static void main(String[] args) {
        int x = -10;
        float y = 2.98f;
        float max = Math.max(x,y);
        float min = Math.min(x,y);
        float abs = Math.abs(x);

        System.out.println("max " + max);
        System.out.println("min " + min);
        System.out.println("abs " + abs);
        System.out.println(Math.sqrt(3));

        // hypotenuse of triangle
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height of triangle: ");
        float height = scanner.nextFloat();

        System.out.print("Enter the base of triangle: ");
        float base = scanner.nextFloat();

        double hypotenuse = Math.sqrt((height*height) + (base*base));
        System.out.println("Hypotenuse of triangle: " + hypotenuse);

        scanner.close(); // closing the input value

    }
}
