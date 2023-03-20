class Student{
    private  String name;
    private int rn;

    void getter()
    {
        System.out.println("Name of Student is "+this.name+" roll Number is "+this.rn);
    }
    void setter(int rn,String name){
        this.rn = rn;
        this.name = name;
    }
}
public class Encapsulation {

    public static void main(String[] args)
    {
Student obj = new Student();
obj.setter(2018021,"pradeep");
obj.getter();
    }
}
