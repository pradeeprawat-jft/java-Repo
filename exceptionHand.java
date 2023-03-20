// Java program to demonstrate working of throws
public class exceptionHand {

    // This method throws an exception
    // to be handled
    // by caller or caller
    // of caller and so on.
   /* static void fun() throws IllegalAccessException
    {
        System.out.println("Inside fun(). ");
        throw new IllegalAccessException("demo");
    }

    // This is a caller function
    public static void main(String args[])
    {
        try {
            fun();
        }
        catch (Exception e) {
            System.out.println("caught in main.");
        }
    }*/

    public static void main(String args[])
    {
        int[] arr = {1,2,3,4};
        try {
            System.out.println(arr[5]);
        }
        catch (Exception e) {
            System.out.println("You can not see that index's element ");
        }
        finally {
            System.out.println("runnable code... whether exceptions occurred or not");
        }
	System.out.println("Hello duniya");
    }


}

