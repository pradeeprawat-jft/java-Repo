class parent {
    public void check(){
        System.out.println("parent method");
    }
}
public class single_inheritance extends parent {
public  void check2(){
    System.out.println("child class");
}
    public static void main(String[] args){
        single_inheritance obj = new single_inheritance();
        obj.check();
        obj.check2();
    }
}
