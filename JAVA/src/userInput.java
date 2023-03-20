import java.util.Scanner ;

public class userInput {
    public static void main(String [] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.print("Enter Your name here_______");
        String name = scanner.nextLine(); // read the line from the user

        System.out.print("Enter your age___ ");
        /**
            ** line -> 18 /n ==== here 18 is stored to var and /n remains in the scanner
            ** i.e. why when we use nextLine() method again ,it already has /n ,so it skips the user input
         **/
         int age = scanner.nextInt(); // reads the int value

        System.out.print("Enter your designation_____");
        String designation = scanner.next(); // reads out the single word and neglects remaining words


        System.out.println("Your name is " + name);
        System.out.println("Your age is " + age);
        System.out.println("Your designation is " + designation);
    }
}
