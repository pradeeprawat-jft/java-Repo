class Parent{
    public void mymethod(){
        System.out.println("calling form parent");
    }
}
class child1 extends  Parent{
    public void mymethod2(){
        System.out.println("calling form Child1");
    }
}

class child2 extends child1
{
    public void mymethod3(){
        System.out.println("calling form child2");
    }
}
class child3 extends  child1
{
    public void mymethod4(){
        System.out.println("calling form Child3");
    }
}
public class hybrid_inheritance {
    public static void main(String[] args)
    {
        child1 obj1 = new child1();
        child2 obj2 = new child2();
        child3 obj3 = new child3();

        obj1.mymethod();
        obj1.mymethod2();
        obj2.mymethod();
        obj2.mymethod3();
        obj3.mymethod();
        obj3.mymethod4();
    }
}
