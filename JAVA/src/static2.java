class Example {
    int x; // instance variable
    static int y; // static variable -> assign default value -> exist till the life of class -> value remains same for each object
    private static int privateStatic;
    public void getVal() {
        System.out.println("X: " + x);
        System.out.println("y: " + y);
    }

    // static variable can not de declared inside the member function
//    public void func() {
//        static int y;
//    }

    // static member function does not access instance variable inside them, only can access static variable of class
    // because static member function can be call without object so , it get hard to identify
    // which object does this instance belong to
    public static void func() { // static member function
//        x = 4; error
    }

    static class Test {
        static int testVar ;
    }
}


public class static2 {
    public static void main(String[] args) {
        Example ex1 = new Example();
        ex1.getVal();
        ex1.x = 10;
        ex1.y = 15;
        ex1.getVal();
        System.out.println("EX2...........");
        Example ex2 = new Example();
        ex2.getVal();
        ex1.x = 10;
        ex1.y += 25;
//        ex1.privateStatic; error
        ex1.getVal();

        System.out.println("Access the static member of inner class of the class");
        System.out.println(Example.Test.testVar);
        System.out.println("Access the static memberdirectly without creating obj");
        System.out.print(Example.y);


    }
}
