class A1{
    public void print(){
        System.out.println("calling form parent class");
    }
}
class B1 extends A1{
    public void print1(){
        System.out.println("calling form child1 class");
    }
}
class B2 extends A1{
    public void print2(){
        System.out.println("calling form child2 class");
    }
}
class B3 extends A1{
    public void print3(){
        System.out.println("calling form child3 class");
    }
}
public class hierarchical_inheritance {
    public static void main(String[] args)
    {
        B1 obj1 = new B1();
        B2 obj2 = new B2();
        B3 obj3 = new B3();

        obj1.print();
        obj1.print1();
        obj2.print();
        obj2.print2();
        obj3.print();
        obj3.print3();
    }
}
