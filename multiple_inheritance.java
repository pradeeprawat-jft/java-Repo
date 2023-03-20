class parent2 {

    parent2(int a){
        System.out.println("a is "+ a);
    }
    public void check() {
        System.out.println("parent method");
    }
}
class parent3 extends parent2 {
    int a, b;
    parent3(int a, int b) {
        super(a);
        this.a = a;
        this.b = b;
    }
    public int sum() {
        return a + b;
    }
}
public class multiple_inheritance extends parent3{
    multiple_inheritance(int a, int b) {
        super(a, b);
    }
    public static void main(String[] args)
    {
        multiple_inheritance obj = new multiple_inheritance(32,4);
        obj.check();
       int ans =  obj.sum();
        System.out.println("sum is "+ans);
    }
}
